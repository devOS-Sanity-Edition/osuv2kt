package one.devos.osuv2kt.models.user

import java.time.OffsetDateTime

public data class RankHighest(
    public val rank: Int,
    public val updatedAt: OffsetDateTime
)
