package one.devos.osuv2kt.models.chat

import one.devos.osuv2kt.models.user.User
import java.time.OffsetDateTime

public data class ChatMessage(
    public val channelId: Int,
    public val content: String,
    public val isAction: Boolean,
    public val messageId: Int,
    public val senderId: Int,
    public val timestamp: OffsetDateTime,
    public val type: ChatMessageType,
    public val uuid: String?,

    // Optional
    public val sender: User?
)
