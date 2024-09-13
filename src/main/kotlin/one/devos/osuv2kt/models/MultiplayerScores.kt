package one.devos.osuv2kt.models

import com.google.gson.JsonObject
import one.devos.osuv2kt.models.score.Score

public data class MultiplayerScores(
    public val cursorString: String?,
    public val params: JsonObject,
    public val scores: Array<Score>,
    public val total: Int?,
    public val userScore: Score
)
