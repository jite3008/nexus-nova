pluginManagement {
    repositories {
        // Essential for resolving plugins like kotlin("multiplatform") and org.jetbrains.compose
        gradlePluginPortal()
        google()
        mavenCentral()
        // Ensure this is present for JetBrains Compose Multiplatform plugins and dependencies
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        // Essential for resolving JetBrains Compose libraries for your modules
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

rootProject.name = "AssistantKMM"
include(":androidApp")
include(":shared")
