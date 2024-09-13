package one.devos.osuv2kt.models.beatmap

import com.google.gson.annotations.SerializedName

public data class BeatmapCovers(
    public val cover: String,
    @SerializedName("cover@2x") public val cover2x: String,

    public val card: String,
    @SerializedName("card@2x") public val card2x: String,

    public val list: String,
    @SerializedName("@list@2x") public val list2x: String,

    public val slimcover: String,
    @SerializedName("@slimcover@2x") public val slimcover2x: String
)