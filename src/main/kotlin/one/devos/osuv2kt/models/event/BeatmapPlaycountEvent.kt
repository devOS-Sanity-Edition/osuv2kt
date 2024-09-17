package one.devos.osuv2kt.models.event

public data class BeatmapPlaycountEvent(
    public val beatmap: EventBeatmap,
    public val count: Int
)
