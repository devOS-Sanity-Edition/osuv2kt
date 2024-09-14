package one.devos.osuv2kt.models.forum

public data class PollOption(
    public val id: Int,
    public val text: Text,
    public val voteCount: Int?
)
