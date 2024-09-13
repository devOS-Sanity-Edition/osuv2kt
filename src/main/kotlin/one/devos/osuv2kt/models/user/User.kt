package one.devos.osuv2kt.models.user

import java.awt.Color
import java.time.OffsetDateTime

public data class User(
    public val avatarUrl: String,
    public val countryCode: String,
    public val defaultGroup: String?,
    public val id: Long,
    public val isActive: Boolean,
    public val isBot: Boolean,
    public val isDeleted: Boolean,
    public val isOnline: Boolean,
    public val isSupporter: Boolean,
    public val lastVisit: OffsetDateTime,
    public val pmFriendsOnly: Boolean,
    public val profileColour: Color?,
    public val username: String,

    // Optionals
    // TODO: accountHistory
    // TODO: activeTournamentBanner
    // TODO: activeTournamentBanners
    // TODO: badges
    public val beatmapPlaycountsCount: Int?,
    public val favouriteBeatmapsetCount: Int?,
    public val followUserMapping: IntArray?,
    public val followerCount: Int?,
    public val graveyardBeatmapsetCount: Int?,
    public val isRestricted: Boolean?,
    // TODO: kudosu
    public val lovedBeatmapsetCount: Int?,
    public val mappingFollowerCount: Int?,
    // TODO: monthlyPlaycounts
    // TODO: rankHighest
    public val scoresBestCount: Int?,
    public val scoresFirstCount: Int?,
    public val scoresRecentCount: Int?,
    public val sessionVerified: Boolean?,
    public val statistics: UserStatistics?,
    // TODO: statisticsRulesets

    // Extended
)
