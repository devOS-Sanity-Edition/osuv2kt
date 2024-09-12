package one.devos.osuv2kt.models

public enum class Covers(value: String? = null) {
    COVER,
    COVER_2X("cover@2x"),
    CARD,
    CARD_2X("card@2x"),
    LIST,
    LIST_2X("list@2x"),
    SLIMCOVER,
    SLIMCOVER_2X("slimcover@2x");

    public val value: String = value ?: name.lowercase() // Default to lowercase name if value is not provided by the enum
}