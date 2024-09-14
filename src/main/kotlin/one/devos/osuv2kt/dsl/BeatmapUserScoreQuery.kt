package one.devos.osuv2kt.dsl

import one.devos.osuv2kt.models.Ruleset

public class BeatmapUserScoreQuery {

    public var beatmap: Int? = null

    public var user: Int? = null

    public var mode: Ruleset? = null

    public fun validateExceptionally(): BeatmapUserScoreQuery = apply {
        if (beatmap == null) {
            throw IllegalArgumentException("Beatmap must be set")
        }

        if (user == null) {
            throw IllegalArgumentException("User must be set")
        }

        if (mode == null) {
            throw IllegalArgumentException("Mode must be set")
        }
    }

}
