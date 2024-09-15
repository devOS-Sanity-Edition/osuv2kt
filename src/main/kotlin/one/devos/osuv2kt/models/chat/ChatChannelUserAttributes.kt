package one.devos.osuv2kt.models.chat

public data class ChatChannelUserAttributes(
    public val canMessage: Boolean,
    public val canMessageError: String?,
    public val lastReadId: Int
)
