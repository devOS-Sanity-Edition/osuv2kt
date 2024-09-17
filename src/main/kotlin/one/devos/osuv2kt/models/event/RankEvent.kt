package one.devos.osuv2kt.models.event

import one.devos.osuv2kt.models.Ruleset

public data class RankEvent(
    public val scoreRank: String,
    public val rank: Int,
    public val mode: Ruleset,
    public val beatmapset: EventBeatmapset,
    public val user: EventUser
)
