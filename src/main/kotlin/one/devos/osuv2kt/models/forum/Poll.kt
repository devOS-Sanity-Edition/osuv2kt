package one.devos.osuv2kt.models.forum

import java.time.OffsetDateTime

public data class Poll(
    public val allowVoteChange: Boolean,
    public val endedAt: OffsetDateTime?,
    public val hideIncompleteResults: Boolean,
    public val lastVoteAt: OffsetDateTime?,
    public val maxVotes: Int,
    public val options: Array<PollOption>,
    public val startedAt: OffsetDateTime,
    public val title: Title,
    public val totalVoteCount: Int
)
