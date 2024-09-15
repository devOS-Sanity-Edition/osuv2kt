package one.devos.osuv2kt.models

import one.devos.osuv2kt.models.beatmap.BeatmapsetDiscussionPermissions
import one.devos.osuv2kt.models.chat.ChatChannelUserAttributes

public data class CurrentUserAttributes(
    public val beatmapsetDiscussionPermissions: BeatmapsetDiscussionPermissions,
    public val chatChannelUserAttributes: ChatChannelUserAttributes
)
