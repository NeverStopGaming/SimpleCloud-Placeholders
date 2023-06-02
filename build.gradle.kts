import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.10"
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "de.jannik"
version = "1.0-SNAPSHOT"

allprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "com.github.johnrengelman.shadow")

    repositories {
        mavenCentral()
    }

    tasks {
        build {
            dependsOn(shadowJar)
        }
    }
}

repositories {
    maven("https://repo.extendedclip.com/content/repositories/placeholderapi/")
    maven("https://repo.thesimplecloud.eu/artifactory/list/gradle-release-local/")

    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/") {
        content {
            includeGroup("org.bukkit")
            includeGroup("org.spigotmc")
        }
    }

    maven("https://oss.sonatype.org/content/repositories/snapshots")
    maven("https://oss.sonatype.org/content/repositories/central")
}

dependencies {
    compileOnly("eu.thesimplecloud.simplecloud:simplecloud-api:2.5.0")
    compileOnly("eu.thesimplecloud.simplecloud:simplecloud-base:2.5.0")
    compileOnly("eu.thesimplecloud.simplecloud:simplecloud-launcher:2.5.0")
    compileOnly("eu.thesimplecloud.simplecloud:simplecloud-plugin:2.5.0")
    compileOnly("eu.thesimplecloud.simplecloud:simplecloud-module-permission:2.5.0")
    compileOnly("me.clip:placeholderapi:2.11.1")

    compileOnly("org.spigotmc:spigot-api:1.8.8-R0.1-SNAPSHOT")
    compileOnly("com.github.azbh111:craftbukkit-1.8.8:R")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}