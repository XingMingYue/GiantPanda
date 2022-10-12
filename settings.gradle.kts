pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven(url = "https://maven.aliyun.com/repository/central")
        maven(url = "https://jitpack.io")
        maven(url = "https://maven.aliyun.com/repository/public")
        maven(url = "https://repo1.maven.org/maven2/")
        maven(url = "https://oss.sonatype.org/content/repositories/public")
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "GiantPanda"
include(":app")
