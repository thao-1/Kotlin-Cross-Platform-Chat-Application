buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:8.0.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0")
        classpath("com.google.gms:google-services:4.3.15")
    }
}

plugins {
    kotlin("multiplatform")
    id("com.android.application") apply false
    id("com.android.library") apply false
    id("org.jetbrains.kotlin.native.cocoapods") version "1.9.0"
}

kotlin {
    android()
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    cocoapods {
        summary = "KMP Chat App"
        homepage = "https://example.com"
        ios.deploymentTarget = "14.1"
        podfile = project.file("iosApp/Podfile")
        framework {
            baseName = "ChatApp"
            isStatic = true
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")
                implementation("dev.gitlive:firebase-auth:1.6.1")
                implementation("dev.gitlive:firebase-firestore:1.6.1")
                implementation("dev.gitlive:firebase-core:1.6.1")
            }
        }
        val androidMain by getting {
            dependencies {
                implementation("androidx.core:core-ktx:1.10.0")
                implementation("androidx.appcompat:appcompat:1.6.1")
                implementation("com.google.android.material:material:1.9.0")
            }
        }
        val iosMain by getting
    }
}

android {
    namespace = "com.example.chatapp"
    compileSdk = 33
    defaultConfig {
        minSdk = 24
        targetSdk = 33
        applicationId = "com.example.chatapp"
    }
    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
    sourceSets["main"].manifest.srcFile("androidApp/src/main/AndroidManifest.xml")
    sourceSets["main"].res.srcDirs("androidApp/src/main/res")
    sourceSets["main"].resources.srcDirs("shared/src/commonMain/resources")
}