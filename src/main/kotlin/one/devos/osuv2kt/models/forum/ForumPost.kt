package one.devos.osuv2kt.models.forum

import java.time.OffsetDateTime

public data class ForumPost(
    public val createdAt: OffsetDateTime,
    public val deletedAt: OffsetDateTime?,
    public val editedAt: OffsetDateTime?,
    public val editedById: Int?,
    public val id: Int,
    public val topicId: Int,
    public val userId: Int,

    // Optional
    public val body: Body?
)
