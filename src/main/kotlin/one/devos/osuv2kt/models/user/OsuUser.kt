package one.devos.osuv2kt.models.user

import java.awt.Color
import java.time.OffsetDateTime

public data class OsuUser(
    public val avatarUrl: String,
    public val countryCode: String,
    // TODO - group
    public val id: Long,
    public val isActive: Boolean,
    public val isBot: Boolean,
    public val isDeleted: Boolean,
    public val isOnline: Boolean,
    public val isSupporter: Boolean,
    public val lastVisit: OffsetDateTime,
    public val pmFriendsOnly: Boolean,
    public val profileColour: Color?,
    public val username: String,
)
