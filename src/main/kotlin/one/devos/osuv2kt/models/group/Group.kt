package one.devos.osuv2kt.models.group

public data class Group(
    public val colour: String?,
    public val hasListing: Boolean,
    public val hasPlaymodes: Boolean,
    public val id: Int,
    public val identifier: String,
    public val isProbationary: Boolean,
    public val name: String,
    public val shortName: String,

    // Optional
    public val description: GroupDescription?
)