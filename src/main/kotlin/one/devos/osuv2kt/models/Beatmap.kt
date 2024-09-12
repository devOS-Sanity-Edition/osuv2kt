package one.devos.osuv2kt.models

public data class Beatmap (
    public val beatmapsetId: Int,
    public val difficultyRating: Float,
    public val id: Int,
    public val mode: Ruleset,
    public val status: RankStatus,
    public val totalLength: Int,
    public val userId: Int,
    public val version: String,

//    public val beatmapset: // TODO: Find a way to take in Beatmap, BeatmapExtended or null. Officially documented:
    // Beatmapset for Beatmap object, BeatmapsetExtended for BeatmapExtended object. null if the beatmap doesn't have associated beatmapset (e.g. deleted).
    public val checksum: String?,
    public val failtimes: Failtimes?,
    public val maxCombo: Int?
)