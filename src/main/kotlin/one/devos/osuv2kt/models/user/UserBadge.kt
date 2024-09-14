package one.devos.osuv2kt.models.user

import com.google.gson.annotations.SerializedName
import java.time.OffsetDateTime

public data class UserBadge(
    public val awardedAt: OffsetDateTime,
    public val description: String,
    @SerializedName("image@2x") public val image2xUrl: String,
    public val imageUrl: String,
    public val url: String
)
