package one.devos.osuv2kt.tests

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import one.devos.osuv2kt.Osu
import one.devos.osuv2kt.models.Ruleset
import one.devos.osuv2kt.models.Scope
import one.devos.osuv2kt.tests.utils.clientId
import one.devos.osuv2kt.tests.utils.clientSecret
import one.devos.osuv2kt.tests.utils.redirectUri
import java.awt.Desktop
import java.net.URI
import kotlin.test.Test

class QueryUserTests {

    private val osu = Osu(
        clientId,
        clientSecret,
        redirectUri,
        setOf(Scope.PUBLIC)
    )

    @Test
    fun testUserQuery() {
        Desktop.getDesktop().browse(URI.create(osu.authorizationUrl))
        startOAuthServer()
    }

    private fun startOAuthServer() {
        embeddedServer(Netty, port = 5573) {
            routing {
                get("callback") {
                    call.respondText("You can close this tab now")

                    val code = call.parameters["code"] ?: throw IllegalArgumentException("Code not found")
                    osu.obtainAndStoreToken(code)

                    // Actually test
                    val user = osu.queryUser {
                        user = "@asojidev"
                        mode = Ruleset.STANDARD
                    }

                    println(user)
                }
            }
        }.start(wait = true)
    }

}
