plugins {
    kotlin("jvm") version "2.0.10"
}

group = "one.devos"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    api(libs.gson)
    api(libs.okhttp)

    // Testing
    testImplementation(kotlin("test"))
    testImplementation(libs.bundles.ktor.server)
    testImplementation(libs.bundles.log4j)
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    explicitApi()
    jvmToolchain(21)
}
