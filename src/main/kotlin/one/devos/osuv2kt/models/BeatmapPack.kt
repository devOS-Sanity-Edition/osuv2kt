package one.devos.osuv2kt.models

import java.time.OffsetDateTime

public data class BeatmapPack(
    public val author: String,
    public val date: OffsetDateTime,
    public val name: String,
    public val noDiffReduction: Boolean,
    public val rulesetId: Int,
    public val tag: String,
    public val url: String
)
