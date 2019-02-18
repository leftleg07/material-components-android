plugins {
    id(Config.Plugins.androidApplication)
}

dependencies {
    api(Config.compatibility("annotation"))
    api(Config.compatibility("appcompat"))

    api(project(Config.fromPath("lib")))

    api(project(Config.fromPath("testing/testapp/base")))
}

android {
    defaultConfig {
        minSdkVersion(14)
        targetSdkVersion(27)
    }

    with(sourceSets["main"]) {
        java.include("*.java")
        java.srcDirs(".")
        java.setExcludes(listOf("**/build/**"))
        res.srcDirs("res")
        manifest.srcFile("AndroidManifest.xml")
    }

}
