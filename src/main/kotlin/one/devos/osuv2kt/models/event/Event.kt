package one.devos.osuv2kt.models.event

import java.time.OffsetDateTime

public data class Event(
    public val createdAt: OffsetDateTime,
    public val id: Int,
//    public val type: EventType // TODO: Event Type and all of its.. weirdness?
)
