package one.devos.osuv2kt.models.beatmap.attributes

import one.devos.osuv2kt.models.beatmap.BeatmapDifficultyAttributes

public data class TaikoBeatmapDifficultyAttributes(
    override val maxCombo: Int,
    override val starRating: Float,

    val staminaDifficulty: Float,
    val rhythmDifficulty: Float,
    val colourDifficulty: Float,
    val approachRate: Float,
    val greatHitWindow: Float
) : BeatmapDifficultyAttributes
