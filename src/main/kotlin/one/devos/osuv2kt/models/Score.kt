package one.devos.osuv2kt.models

import java.time.OffsetDateTime

public data class Score(
    public val accuracy: Float,
    public val beatmapId: Int,
    public val bestId: Int?,
    public val buildId: Int?,
    public val classicTotalScore: Int, // only for solo_score type
    public val endedAt: OffsetDateTime,
    public val hasReplay: Boolean,
    public val id: Int,
    public val isPerfectCombo: Boolean,
    public val legacyPerfect: Boolean,
    public val legacyScoreId: Int?,
    public val legacyTotalScore: Int,
    public val maxCombo: Int,
    public val maximumStatistics: Any,   // this is supposed to be a type named ScoreStatistics but it's not documented?
                                        // TODO: for Sam: here's a rust impl of ScoreStatistics https://github.com/MaxOhn/rosu-v2/blob/1db35d81f0276fc4ba46926152242d6793a46434/src/model/score.rs
    public val mods: Any,    // TODO: same story, look at https://github.com/MaxOhn/rosu-v2/blob/1db35d81f0276fc4ba46926152242d6793a46434/src/model/score.rs
    public val passed: Boolean,
    public val playlistItemId: Int, // only for multiplayer score
    public val pp: Float?,
    public val preserve: Boolean, // only for solo_score type
    public val processed: Boolean,
    public val rank: String,
    public val ranked: Boolean,
    public val roomId: Int,
    public val rulesetId: Int,
    public val startedAt: OffsetDateTime?,
    public val statistics: Any, // once again supposed to be ScoreStatistics
    public val totalScore: Int,
    public val type: String,
    public val userId: Int,

    public val beatmap: Any?,
    public val beatmapset: Any?,
    public val currentUserAttributes: Int?,
    public val match: Any?, // only for legacy match score
    public val position: Int?,
    public val rankCountry: Any?,
    public val rankGlobal: Any?,
    public val scoresAround: MultiplayerScoresAround?, // Scores around the specified score. Only for multiplayer score
    public val user: Any?,
    public val weight: Any?
)
