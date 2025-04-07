pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }

    plugins {
        kotlin("multiplatform").version("1.9.0")
        kotlin("android").version("1.9.0")
        id("com.android.application").version("8.0.0")
        id("com.android.library").version("8.0.0")
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ChatApp"

include(":androidApp")
include(":shared")
include(":iosApp") 