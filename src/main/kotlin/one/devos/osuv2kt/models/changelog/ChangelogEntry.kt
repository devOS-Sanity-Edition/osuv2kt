package one.devos.osuv2kt.models.changelog

import com.google.gson.annotations.SerializedName
import one.devos.osuv2kt.models.GithubUser
import java.time.OffsetDateTime

public data class ChangelogEntry(
    public val category: String,
    public val createdAt: OffsetDateTime,
    public val githubPullRequestId: Int?,
    public val githubUrl: String?,
    public val id: Int?,
    @SerializedName("major") public val isMajor: Boolean,
    public val repository: String?,
    public val title: String?,
    public val type: String,
    public val url: String?,

    // Optionals
    public val githubUser: GithubUser?,
    public val message: String?,
    public val messageHtml: String?
)
