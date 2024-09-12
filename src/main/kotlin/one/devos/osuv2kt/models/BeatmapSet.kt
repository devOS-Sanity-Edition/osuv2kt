package one.devos.osuv2kt.models

public data class BeatmapSet(
    public val artist : String,
    public val artistUnicode: String,
    public val covers: Covers,
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

    // TODO: public val beatmaps: Same problem as Beatmap.kt line 13
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
    public val trackId: Int?
)
