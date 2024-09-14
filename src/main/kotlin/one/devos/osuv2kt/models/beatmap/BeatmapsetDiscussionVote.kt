package one.devos.osuv2kt.models.beatmap

import java.time.OffsetDateTime

public data class BeatmapsetDiscussionVote(
    public val beatmapsetDiscussionId: Int,
    public val createdAt: OffsetDateTime,
    public val id: Int,
    public val score: Int,
    public val updatedAt: OffsetDateTime,
    public val userId: Int
)
