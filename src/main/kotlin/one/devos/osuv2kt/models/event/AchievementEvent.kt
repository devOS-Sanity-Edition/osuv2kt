package one.devos.osuv2kt.models.event

import com.google.gson.JsonElement

public data class AchievementEvent(
    public val achievement: JsonElement, // type is supposed to be Achievement but what
    public val user: EventUser
)
