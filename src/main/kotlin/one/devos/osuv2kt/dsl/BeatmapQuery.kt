package one.devos.osuv2kt.dsl

public class BeatmapQuery {

    public enum class QueryType {
        CHECKSUM,
        FILENAME,
        ID
    }

    public var value: String? = null

    public var type: QueryType? = null

    public fun validateExceptionally(): BeatmapQuery = apply {
        if (value == null) {
            throw IllegalStateException("Value must be set")
        }

        if (type == null) {
            throw IllegalStateException("Type must be set")
        }
    }

}

public class BeatmapQueryBuilder {

    private val query: BeatmapQuery = BeatmapQuery()

    public fun value(value: String): BeatmapQueryBuilder = apply {
        query.value = value
    }

    public fun type(type: BeatmapQuery.QueryType): BeatmapQueryBuilder = apply {
        query.type = type
    }

    public fun build(): BeatmapQuery {
        return query
    }

}
