rootProject.name = "MyApplication"

include(":androidApp")
include(":shared")
include(":desktopApp")

pluginManagement {
  repositories {
    maven("https://maven.aliyun.com/repository/gradle-plugin")
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    maven("https://maven.aliyun.com/repository/google")
    maven("https://maven.aliyun.com/repository/central")
    google()
    mavenCentral()
  }

  plugins {
    val kotlinVersion = extra["kotlin.version"] as String
    val agpVersion = extra["agp.version"] as String
    val composeVersion = extra["compose.version"] as String
    val parcelizeVersion = extra["kotlin.parcelize.version"] as String

    kotlin("jvm").version(kotlinVersion)
    kotlin("multiplatform").version(kotlinVersion)
    kotlin("android").version(kotlinVersion)

    id("com.android.application").version(agpVersion)
    id("com.android.library").version(agpVersion)

    id("org.jetbrains.compose").version(composeVersion)
    id("org.jetbrains.kotlin.plugin.parcelize").version(parcelizeVersion)
  }
}

dependencyResolutionManagement {
  repositories {
    google()
    mavenCentral()
    maven("https://maven.aliyun.com/repository/google")
    maven("https://maven.aliyun.com/repository/central")
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
  }
}
