package one.devos.osuv2kt.models

public data class ChatChannel(
    public val channelId: Int,
    public val name: String,
    public val description: String?,
    public val icon: String?,
    public val type: ChannelType,
    public val messageLengthLimit: Int,
    public val moderated: Boolean,
    public val uuid: String?,

    // Optional
    public val currentUserAttributes: CurrentUserAttributes?,
    public val lastReadId: Int?,
    public val lastMessageId: Int?,
    public val recentMessages: Array<ChatMessage>?,
    public val users: IntArray?
)
