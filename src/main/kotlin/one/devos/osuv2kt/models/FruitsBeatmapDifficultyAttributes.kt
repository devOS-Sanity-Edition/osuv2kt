package one.devos.osuv2kt.models

public data class FruitsBeatmapDifficultyAttributes(
    override val maxCombo: Int,
    override val starRating: Float,

    public val approachRate: Float
) : BeatmapDifficultyAttributes
