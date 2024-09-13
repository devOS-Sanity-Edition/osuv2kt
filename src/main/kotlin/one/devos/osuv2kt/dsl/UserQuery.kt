package one.devos.osuv2kt.dsl

import one.devos.osuv2kt.models.Ruleset

public class OsuUserQuery {

    public var user: String? = null

    public var mode: Ruleset? = null

    public fun validateExceptionally(): OsuUserQuery = apply {
        if (user == null) {
            throw IllegalStateException("User must be set")
        }

        if (mode == null) {
            throw IllegalStateException("Mode must be set")
        }
    }

}

public class OsuUserQueryBuilder {

    private val query: OsuUserQuery = OsuUserQuery()

    public fun user(user: String): OsuUserQueryBuilder = apply {
        query.user = user
    }

    public fun mode(mode: Ruleset): OsuUserQueryBuilder = apply {
        query.mode = mode
    }

    public fun build(): OsuUserQuery {
        return query
    }

}
