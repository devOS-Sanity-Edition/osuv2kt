package one.devos.osuv2kt.models.beatmap

import one.devos.osuv2kt.models.Ruleset

public data class BeatmapsetNomination(
    val beatmapsetId: Int,
    val rulesets: Array<Ruleset>,
    val reset: Boolean,
    val userId: Int
)
