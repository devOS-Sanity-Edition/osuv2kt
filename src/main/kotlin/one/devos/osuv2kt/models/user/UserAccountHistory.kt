package one.devos.osuv2kt.models.user

import java.time.OffsetDateTime

public data class UserAccountHistory(
    public val description: String?,
    public val id: Int,
    public val length: Int,
    public val permanent: Boolean,
    public val timestamp: OffsetDateTime,
    public val type: UserAccountHistoryType
)
