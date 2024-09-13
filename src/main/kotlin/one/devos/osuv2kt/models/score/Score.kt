package one.devos.osuv2kt.models.score

import one.devos.osuv2kt.models.MultiplayerScoresAround
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
    public val maximumStatistics: ScoreStatistics,
    public val mods: Set<ScoreMod>,
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
