plugins {
    kotlin("jvm") version "2.0.10"
}

group = "one.devos"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    api(libs.gson)
    api(libs.okhttp)
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}