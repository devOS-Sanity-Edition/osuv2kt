package one.devos.osuv2kt.models.user

import com.google.gson.JsonElement
import one.devos.osuv2kt.models.*
import java.awt.Color
import java.time.OffsetDateTime

public data class User(
    public val avatarUrl: String,
    public val country: JsonElement,
    public val countryCode: String,
    public val cover: JsonElement,
    public val defaultGroup: String?,
    public val id: Long,
    public val isActive: Boolean,
    public val isBot: Boolean,
    public val isDeleted: Boolean,
    public val isOnline: Boolean,
    public val isRestricted: Boolean,
    public val isSupporter: Boolean,
    public val kudosu: UserKudosu,
    public val lastVisit: OffsetDateTime,
    public val pmFriendsOnly: Boolean,
    public val profileColour: Color?,
    public val username: String,

    // Optionals
    public val accountHistory: Array<UserAccountHistory>?,
    public val activeTournamentBanners: Array<UserProfileBanner>?,
    public val badges: Array<UserBadge>?,
    public val beatmapPlaycountsCount: Int?,
    public val blocks: JsonElement?,
    public val favouriteBeatmapsetCount: Int?,
    public val followUserMapping: IntArray?,
    public val followerCount: Int?,
    public val graveyardBeatmapsetCount: Int?,
    public val groups: Array<UserGroup>?,
    public val guestBeatmapsetCount: Int,
    public val lovedBeatmapsetCount: Int?,
    public val mappingFollowerCount: Int?,
    // TODO: monthlyPlaycounts
    public val page: JsonElement?,
    public val pendingBeatmapsetCount: JsonElement?,
    public val previousUsernames: JsonElement?,
    public val rankHighest: UserRankHighest?,
    public val rankHistory: JsonElement?,
    public val rankedBeatmapsetCount: JsonElement?,
    public val replaysWatchedCounts: JsonElement?,
    public val scoresBestCount: Int?,
    public val scoresFirstCount: Int?,
    public val scoresRecentCount: Int?,
    public val sessionVerified: Boolean?,
    public val statistics: UserStatistics?,
    // TODO: statisticsRulesets
    public val supportLevel: JsonElement?,
    public val unreadPmCount: JsonElement?,
    public val userAchievements: JsonElement?,
    public val userPreferences: JsonElement?,

    // Extended
    public val coverUrl: String?,
    public val discord: String?,
    public val hasSupported: Boolean?,
    public val interests: String?,
    public val joinDate: OffsetDateTime?,
    public val location: String?,
    public val maxBlocks: Int?,
    public val maxFriends: Int?,
    public val occupation: String?,
    public val playmode: Ruleset,
    public val playstyle: Array<String>?,
    public val postCount: Int,
    public val profileHue: Int?,
    public val profileOrder: List<String>,
    public val title: String?,
    public val titleUrl: String?,
    public val twitter: String?,
    public val website: String?
)
