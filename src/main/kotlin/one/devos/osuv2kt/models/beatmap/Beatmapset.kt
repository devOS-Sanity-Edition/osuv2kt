package one.devos.osuv2kt.models.beatmap

import com.google.gson.JsonElement
import java.time.OffsetDateTime

public data class Beatmapset(
    public val artist : String,
    public val artistUnicode: String,
    public val covers: BeatmapCovers,
    public val creator: String,
    public val favouriteCount: Int,
    public val id: Int,
    public val nsfw: Boolean,
    public val offset: Int,
    public val playCount: Int,
    public val previewUrl: String,
    public val source: String,
    public val status: String,
    public val spotlight: Boolean,
    public val title: String,
    public val titleUnicode: String,
    public val userId: Int,
    public val video: Boolean,

    // Optionals
    public val beatmaps: Array<Beatmap>,
    public val converts: JsonElement?,
    public val currentNominations: Array<BeatmapsetNomination>?,
    public val currentUserAttributes: JsonElement?,
    public val description: JsonElement?,
    public val discussions: JsonElement?,
    public val events: JsonElement?,
    public val genre: JsonElement?,
    public val hasFavourited: Boolean?,
    public val language: JsonElement?,
    public val nominations: JsonElement?,
    public val packTags: Array<String>?,
    public val ratings: JsonElement?,
    public val recentFavourites: JsonElement?,
    public val relatedUsers: JsonElement?,
    public val user: JsonElement?,
    public val trackId: Int?,

    // Extended
    public val availability: BeatmapsetAvailability,
    public val bpm: Float?,
    public val canBeHyped: Boolean?,
    public val deletedAt: OffsetDateTime?,
    public val discussionLocked: Boolean?,
    public val hype: BeatmapsetHype,
    public val isScoreable: Boolean?,
    public val lastUpdated: OffsetDateTime?,
    public val legacyThreadUrl: String?,
    public val nominationsSummary: BeatmapsetNominationsSummary,
    public val ranked: Int?,
    public val rankedDate: OffsetDateTime?,
    public val storyboard: Boolean?,
    public val submittedDate: OffsetDateTime?,
    public val tags: String
)
