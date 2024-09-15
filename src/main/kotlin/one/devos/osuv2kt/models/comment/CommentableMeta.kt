package one.devos.osuv2kt.models.comment

import one.devos.osuv2kt.models.CurrentUserAttributes

public data class CommentableMeta(
    public val currentUserAttributes: CommentableMetaCurrentUserAttributes?,
    public val id: Int?,
    public val ownerId: Int?,
    public val ownerTitle: String?,
    public val title: String,
    public val type: String?,
    public val url: String?
)
