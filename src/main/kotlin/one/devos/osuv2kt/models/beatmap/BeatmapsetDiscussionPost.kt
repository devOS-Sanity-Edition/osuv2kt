package one.devos.osuv2kt.models.beatmap

import java.time.OffsetDateTime

public data class BeatmapsetDiscussionPost(
    public val beatmapsetDisucssionId: Int,
    public val createdAt: OffsetDateTime,
    public val deletedAt: OffsetDateTime?,
    public val deletedById: Int?,
    public val id: Int,
    public val lastEditorId: Int?,
    public val message: String,
    public val system: Boolean,
    public val updatedAt: OffsetDateTime,
    public val userId: Int
)
