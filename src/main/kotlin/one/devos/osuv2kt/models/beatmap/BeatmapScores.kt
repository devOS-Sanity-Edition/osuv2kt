package one.devos.osuv2kt.models.beatmap

import one.devos.osuv2kt.models.score.Score

public data class BeatmapScores(
    public val scores: Array<Score>,
    public val userScore: BeatmapUserScore // this val is actually called userScore and not user_score, so you might want to account for that through gson's thingy
)
