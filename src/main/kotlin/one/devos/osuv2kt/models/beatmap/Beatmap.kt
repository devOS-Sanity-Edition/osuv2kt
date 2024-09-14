package one.devos.osuv2kt.models.beatmap

import one.devos.osuv2kt.models.RankStatus
import one.devos.osuv2kt.models.Ruleset
import java.time.OffsetDateTime

public data class Beatmap(
    public val beatmapsetId: Int,
    public val difficultyRating: Float,
    public val id: Int,
    public val mode: Ruleset,
    public val status: RankStatus,
    public val totalLength: Int,
    public val userId: Int,
    public val version: String,

    // Optionals
    public val beatmapset: Beatmapset?,
    public val checksum: String?,
    public val failtimes: Failtimes?,
    public val maxCombo: Int?,

    // Extended
    public val accuracy: Float?,
    public val ar: Float?,
    public val bpm: Float?,
    public val convert: Boolean?,
    public val countCircles: Int?,
    public val countSliders: Int?,
    public val countSpinners: Int?,
    public val cs: Float?,
    public val deletedAt: OffsetDateTime?,
    public val drain: Float?,
    public val hitLength: Int?,
    public val isScoreable: Boolean?,
    public val lastUpdated: OffsetDateTime?,
    public val modeInt: Int?,
    public val passcount: Int?,
    public val playcount: Int?,
    public val ranked: RankStatus?,
    public val url: String?,
)
