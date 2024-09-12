package one.devos.osuv2kt.models

public data class TaikoBeatmapDifficultyAttributes(
    override val maxCombo: Int,
    override val starRating: Float,

    val staminaDifficulty: Float,
    val rhythmDifficulty: Float,
    val colourDifficulty: Float,
    val approachRate: Float,
    val greatHitWindow: Float
) : BeatmapDifficultyAttributes
