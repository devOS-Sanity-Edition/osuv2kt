package one.devos.osuv2kt.models.forum

public data class ForumPollOption(
    public val id: Int,
    public val text: ForumText,
    public val voteCount: Int?
)
