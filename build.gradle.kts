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
    testImplementation("io.ktor:ktor-server-core:2.3.12")
    testImplementation("io.ktor:ktor-server-netty:2.3.12")
    testImplementation("org.apache.logging.log4j:log4j-api:2.20.0")
    testImplementation("org.apache.logging.log4j:log4j-core:2.20.0")
    testImplementation("org.apache.logging.log4j:log4j-slf4j-impl:2.20.0")
    testImplementation("org.apache.logging.log4j:log4j-slf4j2-impl:2.20.0")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    explicitApi()
    jvmToolchain(21)
}
