package one.devos.osuv2kt.models

public enum class BeatmapPackType(public val tag: String) {
    STANDARD("S"),
    FEATURED("F"),
    TOURNAMENT("P"),
    LOVED("L"),
    CHART("R"),
    THEME("T"),
    ARTIST("A")
}