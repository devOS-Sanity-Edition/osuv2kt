package one.devos.osuv2kt.models.event

import one.devos.osuv2kt.models.Ruleset

public data class RankLostEvent(
    public val mode: Ruleset,
    public val beatmap: EventBeatmap,
    public val user: EventUser,
)
