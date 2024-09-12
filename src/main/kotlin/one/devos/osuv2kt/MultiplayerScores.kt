package one.devos.osuv2kt

import com.google.gson.JsonObject
import one.devos.osuv2kt.models.Score

public data class MultiplayerScores(
    public val cursorString: CursorString,
    public val params: JsonObject,
    public val scores: Array<Score>,
    public val total: Int?,
    public val userScore: Score
)
