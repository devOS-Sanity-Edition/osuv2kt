package one.devos.osuv2kt.models.comment

import java.time.OffsetDateTime

public data class Comment(
    public val commentableId: Int,
    public val commentableType: String,
    public val createdAt: OffsetDateTime,
    public val deletedAt: OffsetDateTime?,
    public val editedAt: OffsetDateTime?,
    public val editedById: Int?,
    public val id: Int,
    public val legacyName: String?,
    public val message: String?,
    public val messageHtml: String?,
    public val parentId: Int?,
    public val pinned: Boolean,
    public val repliesCount: Int,
    public val updatedAt: OffsetDateTime,
    public val userId: Int,
    public val votesCount: Int
)
