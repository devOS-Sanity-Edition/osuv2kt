package one.devos.osuv2kt.models.event

public data class BeatmapsetApproveEvent(
    public val approval: Approval,
    public val beatmapset: EventBeatmapset,
    public val user: EventUser
)
