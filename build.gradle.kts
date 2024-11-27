plugins {
    id("com.autonomousapps.dependency-analysis") version "2.5.0"
    kotlin("jvm") version "2.0.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

dependencyAnalysis { issues { all { onAny { severity("fail") } } } }

kotlin {
    jvmToolchain(21)
}