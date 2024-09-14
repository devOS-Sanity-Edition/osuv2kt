package one.devos.osuv2kt.models.build

public data class BuildUpdateStream(
    public val displayVersion: String,
    public val id: Int,
    public val isFeatured: Boolean,
    public val name: String,

    // Optionals
    public val latestBuild: Build?,
    public val userCount: Int
)
