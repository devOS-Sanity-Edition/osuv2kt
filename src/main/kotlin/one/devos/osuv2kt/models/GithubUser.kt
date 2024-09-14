package one.devos.osuv2kt.models

public data class GithubUser(
    public val displayName: String,
    public val githubUrl: String?,
    public val githubUsername: String?,
    public val id: Int?,
    public val osuUsername: String?,
    public val userId: Int?,
    public val userUrl: String?
)
