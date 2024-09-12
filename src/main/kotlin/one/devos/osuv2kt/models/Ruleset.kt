package one.devos.osuv2kt.models

public enum class Ruleset(
    value: String? = null
) {

    STANDARD("osu"),
    MANIA,
    CATCH("fruits"),
    TAIKO;

    public val value: String = value ?: name.lowercase() // Default to lowercase name if value is not provided by the enum

}
