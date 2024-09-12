package one.devos.osuv2kt

import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import one.devos.osuv2kt.dsl.OsuUserQuery
import one.devos.osuv2kt.models.RankStatus
import one.devos.osuv2kt.models.Scope
import one.devos.osuv2kt.models.oauth2.TokenResponse
import one.devos.osuv2kt.models.user.OsuUser
import one.devos.osuv2kt.utils.ColorDeserializer
import one.devos.osuv2kt.utils.OffsetDateTimeDeserializer
import one.devos.osuv2kt.utils.RankStatusDeserializer
import java.awt.Color
import java.time.OffsetDateTime

public class Osu(
    private val clientId: String,
    private val clientSecret: String,
    private val redirectUri: String,
    private val scopes: Set<Scope>
) {

    public companion object {

        public const val BASE_URL: String = "https://osu.ppy.sh/api/v2"

    }

    private val client: OkHttpClient = OkHttpClient()
    private val gson = GsonBuilder()
        .registerTypeAdapter(OffsetDateTime::class.java, OffsetDateTimeDeserializer())
        .registerTypeAdapter(RankStatus::class.java, RankStatusDeserializer())
        .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        .registerTypeAdapter(Color::class.java, ColorDeserializer())
        .setPrettyPrinting()
        .create()

    public var token: TokenResponse? = null
        get() {
            if (field == null) {
                throw IllegalStateException("Osu! API has not been authenticated")
            }

            return field
        }
        set(value) {
            if (value == null) {
                throw IllegalArgumentException("Token cannot be null")
            }

            if (field != null) {
                throw IllegalStateException("Token has already been set: $field")
            }

            field = value
        }

    public val authorizationUrl: String
        get() = buildString {
            append("https://osu.ppy.sh/oauth/authorize")
            append("?client_id=$clientId")
            append("&redirect_uri=$redirectUri")
            append("&response_type=code")
            append("&scope=${scopes.joinToString(" ")}")
        }

    public fun obtainToken(code: String): TokenResponse {
        val request = Request.Builder()
            .url("https://osu.ppy.sh/oauth/token")
            .post(gson.toJson(mapOf(
                "client_id" to clientId,
                "client_secret" to clientSecret,
                "code" to code,
                "grant_type" to "authorization_code",
                "redirect_uri" to redirectUri
            )).toRequestBody("application/json".toMediaType())).build()

        val response = client.newCall(request).execute()
        return response.use { response ->
            if (!response.isSuccessful) {
                throw IllegalStateException("Unexpected code $response")
            }

            val body = response.body?.string()
            gson.fromJson(body, TokenResponse::class.java)
        }
    }

    public fun obtainAndStoreToken(code: String): TokenResponse {
        val token = obtainToken(code)
        this.token = token
        return token
    }

    public fun queryUser(block: OsuUserQuery.() -> Unit): OsuUser {
        val query = OsuUserQuery()
            .apply(block)
            .validateExceptionally()

        val request = Request.Builder()
            .url("${BASE_URL}/users/${query.user}/${query.mode?.value}")
            .header("Authorization", "Bearer ${token?.accessToken}")
            .build()

        val response = client.newCall(request).execute()
        return response.use { response ->
            if (!response.isSuccessful) {
                throw IllegalStateException("Unexpected code $response")
            }

            val body = response.body?.string()
            gson.fromJson(body, OsuUser::class.java)
        }
    }
}
