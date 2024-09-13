package one.devos.osuv2kt.tests

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import one.devos.osuv2kt.Osu
import one.devos.osuv2kt.dsl.BeatmapQuery
import one.devos.osuv2kt.models.Ruleset
import one.devos.osuv2kt.models.Scope
import one.devos.osuv2kt.tests.utils.clientId
import one.devos.osuv2kt.tests.utils.clientSecret
import one.devos.osuv2kt.tests.utils.redirectUri
import org.junit.jupiter.api.*
import java.awt.Desktop
import java.net.URI

class QueryTests {

    private val osu = Osu(
        clientId,
        clientSecret,
        redirectUri,
        setOf(Scope.PUBLIC)
    )

    @Test
    fun run() {
        Desktop.getDesktop().browse(URI.create(osu.authorizationUrl))
        startOAuthServer {
            // Query user
            val testUser = osu.queryUser {
                user = "@asojidev"
                mode = Ruleset.STANDARD
            }

            println("User: $testUser")

            // Query beatmap
            val beatmap = osu.queryBeatmap {
                value = "1657912"
                type = BeatmapQuery.QueryType.ID
            }

            println("Beatmap: $beatmap")
        }
    }

    private fun startOAuthServer(block: () -> Unit) {
        embeddedServer(Netty, port = 5573) {
            routing {
                get("callback") {
                    call.respondText("You can close this tab now")

                    val code = call.parameters["code"] ?: throw IllegalArgumentException("Code not found")
                    osu.obtainAndStoreToken(code)

                    block()
                }
            }
        }.start(wait = true)
    }
}
