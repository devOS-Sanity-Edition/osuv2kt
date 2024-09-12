package one.devos.osuv2kt.models

public enum class RankingType(value: String? = null) {
    SPOTLIGHT("charts"),
    COUNTRY,
    PERFORMANCE,
    SCORE;

    public val value: String = value ?: name.lowercase() // Default to lowercase name if value is not provided by the enum
}