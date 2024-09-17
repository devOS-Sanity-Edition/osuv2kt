package one.devos.osuv2kt.models.event

public data class BeatmapsetReviveEvent(
    public val beatmapset: EventBeatmapset,
    public val user: EventUser
)
