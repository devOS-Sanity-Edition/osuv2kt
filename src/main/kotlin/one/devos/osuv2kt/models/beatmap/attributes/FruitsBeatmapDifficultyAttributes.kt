package one.devos.osuv2kt.models.beatmap.attributes

import one.devos.osuv2kt.models.beatmap.BeatmapDifficultyAttributes

public data class FruitsBeatmapDifficultyAttributes(
    override val maxCombo: Int,
    override val starRating: Float,

    public val approachRate: Float
) : BeatmapDifficultyAttributes
