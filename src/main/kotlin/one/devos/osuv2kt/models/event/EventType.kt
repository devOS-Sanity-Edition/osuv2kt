package one.devos.osuv2kt.models.event

public data class EventType(
    public val achievement: AchievementEvent,
    public val beatmapPlayground: BeatmapPlaycountEvent,
    public val beatmapsetApprove: BeatmapsetApproveEvent,
    public val beatmapsetDelete: BeatmapsetDeleteEvent,
    public val beatmapsetRevive: BeatmapsetReviveEvent,
    public val beatmapsetUpdate: BeatmapsetUpdateEvent,
    public val beatmapsetUpload: BeatmapsetUploadEvent,
    public val rank: RankEvent,
    public val rankLost: RankLostEvent,
    public val userSupportAgain: UserSupportAgainEvent,
    public val userSupportFirst: UserSupportFirstEvent,
    public val userSupportGift: UserSupportGiftEvent,
    public val usernameChange: UsernameChangeEvent
)
