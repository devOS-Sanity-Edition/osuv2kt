package one.devos.osuv2kt.models.beatmap

import one.devos.osuv2kt.models.Nomination
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
    public val converts: Any?,
    public val currentNominations: Array<Nomination>?,
    public val currentUserAttributes: Any?,
    public val description: Any?,
    public val discussions: Any?,
    public val events: Any?,
    public val genre: Any?,
    public val hasFavourited: Boolean?,
    public val language: Any?,
    public val nominations: Any?,
    public val packTags: Array<String>?,
    public val ratings: Any?,
    public val recentFavourites: Any?,
    public val relatedUsers: Any?,
    public val user: Any?,
    public val trackId: Int?,

    // Extended
    // TODO: availability.download_disabled - Is this inside of an object?
    // TODO: availability.more_information - Is this inside of an object?
    public val bpm: Float?,
    public val canBeHyped: Boolean?,
    public val deletedAt: OffsetDateTime?,
    public val discussionLocked: Boolean?,
    // TODO: hype.current - Is this inside of an object?
    // TODO: hype.required - Is this inside of an object?
    public val isScoreable: Boolean?,
    public val lastUpdated: OffsetDateTime?,
    public val legacyThreadUrl: String?,
    // TODO: nominations_summary.current - Is this inside of an object?
    // TODO: nominations_summary.required - Is this inside of an object?
    public val ranked: Int?,
    public val rankedDate: OffsetDateTime?,
    public val storyboard: Boolean?,
    public val submittedDate: OffsetDateTime?,
    public val tags: String
)
