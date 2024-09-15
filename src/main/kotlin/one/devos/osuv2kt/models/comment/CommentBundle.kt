package one.devos.osuv2kt.models.comment

import one.devos.osuv2kt.models.user.User

public data class CommentBundle(
    public val commentableMeta: Array<CommentableMeta>,
    public val comments: Array<Comment>,
    public val cursor: String, // should be Cursor
    public val hasMore: Boolean,
    public val hasMoreId: Int?,
    public val includedComments: Array<Comment>,
    public val pinnedComments: Array<Comment>?,
    public val sort: String,
    public val topLevelCount: Int?,
    public val total: Int?,
    public val userFollow: Boolean,
    public val userVotes: IntArray,
    public val users: Array<User>
)
