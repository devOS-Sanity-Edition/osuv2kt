package one.devos.osuv2kt.models.beatmap.attributes

import one.devos.osuv2kt.models.beatmap.BeatmapDifficultyAttributes

public data class OsuBeatmapDifficultyAttributes(
    override val maxCombo: Int,
    override val starRating: Float,

    public val aimDifficulty: Float,
    public val approachRate: Float,
    public val flashlightDifficulty: Float,
    public val overallDifficulty: Float,
    public val sliderFactor: Float,
    public val speedDifficulty: Float
) : BeatmapDifficultyAttributes
