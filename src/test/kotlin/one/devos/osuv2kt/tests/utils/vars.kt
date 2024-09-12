package one.devos.osuv2kt.tests.utils

val clientId: String
    get() = System.getenv("OSU_CLIENT_ID") ?: throw IllegalStateException("OSU_CLIENT_ID is not set")

val clientSecret: String
    get() = System.getenv("OSU_CLIENT_SECRET") ?: throw IllegalStateException("OSU_CLIENT_SECRET is not set")

val redirectUri: String
    get() = System.getenv("OSU_REDIRECT_URI") ?: throw IllegalStateException("OSU_REDIRECT_URI is not set")
