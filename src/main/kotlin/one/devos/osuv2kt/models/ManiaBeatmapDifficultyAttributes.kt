package one.devos.osuv2kt.models

public data class ManiaBeatmapDifficultyAttributes(
    override val maxCombo: Int,
    override val starRating: Float,

    public val greatHitWindow: Float,
    public val scoreMultiplier: Float
) : BeatmapDifficultyAttributes
