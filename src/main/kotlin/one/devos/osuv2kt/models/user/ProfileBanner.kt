package one.devos.osuv2kt.models.user

import com.google.gson.annotations.SerializedName

public data class ProfileBanner(
    public val id: Int,
    public val tournamentId: Int,
    public val image: String?,
    @SerializedName("image@2x") public val image2x: String?
)
