package one.devos.osuv2kt.models.score

import com.google.gson.annotations.SerializedName

public data class ScoreStatistics(
    @SerializedName("count_miss")
    val miss: Int = 0,

    @SerializedName("count_50")
    val meh: Int = 0,

    @SerializedName("count_100")
    val ok: Int = 0,

    @SerializedName("count_katu")
    val good: Int = 0,

    @SerializedName("count_300")
    val great: Int = 0,

    @SerializedName("count_geki")
    val perfect: Int = 0,

    val largeTickHit: Int = 0,
    val largeTickMiss: Int = 0,
    val smallTickHit: Int = 0,
    val smallTickMiss: Int = 0,
    val ignoreHit: Int = 0,
    val ignoreMiss: Int = 0,
    val largeBonus: Int = 0,
    val smallBonus: Int = 0,
    val sliderTailHit: Int = 0,
    val comboBreak: Int = 0,
    val legacyComboIncrease: Int = 0
)

