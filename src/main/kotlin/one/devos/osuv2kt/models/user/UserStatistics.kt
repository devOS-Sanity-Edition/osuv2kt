package one.devos.osuv2kt.models.user

public data class UserStatistics(
    public val count100: Int,
    public val count300: Int,
    public val count50: Int,
    public val countMiss: Int,
    public val countryRank: Int?,
    // TODO: grade_counts.a - Is this inside of an object?
    // TODO: grade_counts.s - Is this inside of an object?
    // TODO: grade_counts.sh - Is this inside of an object?
    // TODO: grade_counts.ss - Is this inside of an object?
    // TODO: grade_counts.ssh - Is this inside of an object?
    public val hitAccuracy: Float,
    public val isRanked: Boolean,
    // TODO: level.current - Is this inside of an object?
    // TODO: level.progress - Is this inside of an object?
    public val maximumCombo: Int,
    public val playCount: Int,
    public val playTime: Int,
    public val pp: Float,
    public val ppExp: Float,
    public val globalRank: Int?,
    public val globalRankExp: Int?,
    public val rankedScore: Int,
    public val replaysWatchedByOthers: Int,
    public val totalHits: Int,
    public val totalScore: Int,

    // Optionals
    public val rankChangeSince30Days: Int?,
    public val user: User?
)
