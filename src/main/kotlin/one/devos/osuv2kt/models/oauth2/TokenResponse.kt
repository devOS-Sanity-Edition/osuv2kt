package one.devos.osuv2kt.models.oauth2

public data class TokenResponse(
    public val accessToken: String,
    public val refreshToken: String,
    public val expiresIn: Long,
)
