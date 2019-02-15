plugins {
  id(Config.Plugins.androidApplication)
}

dependencies {
  api(Config.compatibility("annotation"))
  api(Config.compatibility("appcompat"))

  api(project(Config.fromPath("lib")))
  api(project(Config.fromPath("testing/testapp/base")))
  api(project(Config.fromPath("testing/testapp/custom")))

  api("androidx.multidex:multidex:2.0.0")
}

val srcDirs = listOf(
  "com.google.android.material.testapp.appbar"
)

android {
  defaultConfig {
    multiDexEnabled=true
    minSdkVersion(14)
    targetSdkVersion(27)
  }

  with(sourceSets["main"]) {
    srcDirs.forEach {
      res.srcDirs("src/main/java/$it/res")
    }
  }

  buildTypes {
    this.getByName("debug") {
      isPseudoLocalesEnabled=true
    }
  }
}
