package one.devos.osuv2kt.models

public data class Nomination(
    val beatmapsetId: Int,
    val rulesets: Array<Ruleset>,
    val reset: Boolean,
    val userId: Int
)
