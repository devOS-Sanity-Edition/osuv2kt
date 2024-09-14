package one.devos.osuv2kt.models.beatmap

import com.google.gson.JsonElement

public data class BeatmapsetDiscussionPermissions(
    public val canDestroy: JsonElement,
    public val canReopen: JsonElement,
    public val canModerateKudosu: JsonElement,
    public val canResolve: JsonElement,
    public val voteScore: JsonElement
)
