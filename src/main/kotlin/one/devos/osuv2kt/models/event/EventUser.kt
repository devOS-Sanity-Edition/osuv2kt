package one.devos.osuv2kt.models.event

public data class EventUser(
    public val username: String,
    public val url: String,

    // only for usernameChange event
    public val previousUsername: String?
)
