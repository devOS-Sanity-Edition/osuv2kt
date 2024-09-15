package one.devos.osuv2kt.models.forum

import java.time.OffsetDateTime

public data class ForumTopic(
    public val createdAt: OffsetDateTime,
    public val deletedAt: OffsetDateTime?,
    public val firstPostId: Int,
    public val forumId: Int,
    public val id: Int,
    public val isLocked: Boolean,
    public val lastPostId: Int,
    public val poll: ForumPoll?,
    public val postCount: Int,
    public val title: String,
    public val type: ForumType,
    public val updatedAt: OffsetDateTime,
    public val userId: Int
)
