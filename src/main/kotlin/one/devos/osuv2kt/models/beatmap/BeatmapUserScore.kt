package one.devos.osuv2kt.models.beatmap

import one.devos.osuv2kt.models.score.Score

public data class BeatmapUserScore(
    public val position: Int,
    public val score: Score
)
