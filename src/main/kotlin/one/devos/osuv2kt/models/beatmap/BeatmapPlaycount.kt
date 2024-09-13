package one.devos.osuv2kt.models.beatmap

public data class BeatmapPlaycount(
    public val beatmapId: Int,
    public val beatmap: Beatmap,
    public val beatmapSet: Beatmapset,
    public val count: Int
)
