plugins {
    kotlin("jvm") version "2.0.10"
    `maven-publish`

    alias(libs.plugins.grgit)
}

group = "one.devos"
version = "0.1.0+rev.${grgit.head().abbreviatedId}" // im not gonna do any logic for this atm, but maybe later

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

// This will attempt to publish the mod to the devOS Maven, otherwise it will build the mod locally
// This is auto run by GitHub Actions
task("buildOrPublish") {
    group = "build"
    var mavenUser = System.getenv().get("MAVEN_USER")
    if (!mavenUser.isNullOrEmpty()) {
        dependsOn(tasks.getByName("publish"))
        println("prepared for publish")
    } else {
        dependsOn(tasks.getByName("build"))
        println("prepared for build")
    }
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            groupId = group.toString()
            artifactId = "osuv2kt"
            version = version

            from(components.get("java"))
        }
    }

    repositories {
        maven {
            url = uri("https://mvn.devos.one/${System.getenv()["PUBLISH_SUFFIX"]}/")
            credentials {
                username = System.getenv()["MAVEN_USER"]
                password = System.getenv()["MAVEN_PASS"]
            }
        }
    }
}