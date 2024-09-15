package one.devos.osuv2kt.models.forum

import java.time.OffsetDateTime

public data class ForumPoll(
    public val allowVoteChange: Boolean,
    public val endedAt: OffsetDateTime?,
    public val hideIncompleteResults: Boolean,
    public val lastVoteAt: OffsetDateTime?,
    public val maxVotes: Int,
    public val options: Array<ForumPollOption>,
    public val startedAt: OffsetDateTime,
    public val title: ForumTitle,
    public val totalVoteCount: Int
)
