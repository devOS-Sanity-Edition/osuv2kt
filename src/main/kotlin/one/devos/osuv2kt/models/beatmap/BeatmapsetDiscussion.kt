package one.devos.osuv2kt.models.beatmap

import com.google.gson.JsonElement
import one.devos.osuv2kt.models.CurrentUserAttributes
import java.time.OffsetDateTime

public data class BeatmapsetDiscussion(
    public val beatmap: Beatmap?,
    public val beatmapId: Int?,
    public val beatmapset: Beatmapset?,
    public val beatmapsetId: Int,
    public val canBeResolved: Boolean,
    public val canGrantKudosu: Boolean,
    public val createdAt: OffsetDateTime,
    public val currentUserAttributes: CurrentUserAttributes,
    public val deletedAt: OffsetDateTime?,
    public val deletedById: Int?,
    public val id: Int,
    public val kudosuDenied: Boolean,
    public val lastPostAt: OffsetDateTime,
    public val messageType: JsonElement, // TODO: This is supposed to be type MessageType but it is undocumented
    public val parentId: Int?,
    public val posts: Array<BeatmapsetDiscussionPost>,
    public val resolved: Boolean,
    public val startingPost: BeatmapsetDiscussionPost?,
    public val timestamp: Int,
    public val updatedAt: OffsetDateTime,
    public val userId: Int
)
