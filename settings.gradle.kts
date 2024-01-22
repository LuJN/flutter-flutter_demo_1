val storageUrl = System.getenv().get("FLUTTER_STORAGE_BASE_URL") ?: "https://storage.googleapis.com"

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            setUrl("flutter_module_2\\build\\host\\outputs\\repo")
        }
        maven {
            setUrl("$storageUrl/download.flutter.io")
        }
    }
}

rootProject.name = "My Application"
include(":app")
 