package one.devos.osuv2kt.models.user

public data class UserStatistics(
    public val count100: Int,
    public val count300: Int,
    public val count50: Int,
    public val countMiss: Int,
    public val countryRank: Int?,
    public val gradeCounts: UserGradeCounts,
    public val hitAccuracy: Float,
    public val isRanked: Boolean,
    public val level: UserLevel,
    public val maximumCombo: Int,
    public val playCount: Int,
    public val playTime: Int,
    public val pp: Float,
    public val ppExp: Float,
    public val globalRank: Int?,
    public val globalRankExp: Int?,
    public val rankedScore: Long,
    public val replaysWatchedByOthers: Int,
    public val totalHits: Int,
    public val totalScore: Long,

    // Optionals
    public val rankChangeSince30Days: Int?,
    public val user: User?
)
