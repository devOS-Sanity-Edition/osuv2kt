package one.devos.osuv2kt.models

public enum class RankStatus(public val possibleValues: Set<Any>) {
    GRAVEYARD(setOf(-2, "graveyard")),
    WIP(setOf(-1, "graveyard")),
    PENDING(setOf(0, "pending")),
    RANKED(setOf(1, "ranked")),
    APPROVED(setOf(2, "approved")),
    QUALIFIED(setOf(3, "qualified")),
    LOVED(setOf(4, "loved"));

    public companion object {
        public fun from(any: Any): RankStatus {
            return entries.firstOrNull { status ->
                status.possibleValues.contains(any)
            } ?: throw IllegalArgumentException("No status found with value $any")
        }
    }
}