package one.devos.osuv2kt.models

public data class BeatmapPlaycount(
    public val beatmapId: Int,
    public val beatmap: Beatmap,
    public val beatmapSet: BeatmapSet,
    public val count: Int
)
