package one.devos.osuv2kt.models.build

import com.google.gson.annotations.SerializedName
import one.devos.osuv2kt.models.changelog.ChangelogEntry
import java.time.OffsetDateTime

public data class Build(
    public val createdAt: OffsetDateTime,
    public val displayVersion: String,
    public val id: Int,
    public val updateStream: BuildUpdateStream?,
    @SerializedName("users") public val userCount: Int,
    public val version: String?,
    public val youtubeId: String?,

    // Optionals
    public val changelogEntries: Set<ChangelogEntry>?,
    public val versions: BuildVersions?
)
