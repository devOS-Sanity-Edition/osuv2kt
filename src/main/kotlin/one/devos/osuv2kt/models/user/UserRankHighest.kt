package one.devos.osuv2kt.models.user

import java.time.OffsetDateTime

public data class UserRankHighest(
    public val rank: Int,
    public val updatedAt: OffsetDateTime
)
