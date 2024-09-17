package one.devos.osuv2kt.models.event

public data class BeatmapsetUploadEvent(
    public val beatmapset: EventBeatmapset,
    public val user: EventUser
)
