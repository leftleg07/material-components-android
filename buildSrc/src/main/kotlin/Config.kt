object Config {

  private const val kotlinVersion = "1.3.11"

  object Plugins {
    private const val androidgradleVersion = "3.3.0"
    private const val androidMavenGradleVersion = "2.1"
    const val androidGradle = "com.android.tools.build:gradle:$androidgradleVersion"
    const val androidMavenGradle = "com.github.dcendents:android-maven-gradle-plugin:$androidMavenGradleVersion"
    const val androidApplication = "com.android.application"
    const val androidLibrary = "com.android.library"
    const val androidTest = "com.android.test"
    const val androidMaven = "com.github.dcendents.android-maven"
  }

  object MdcLibs {
    // Current version of the library (could be in-development/unreleased).
    const val version = "1.1.0-alpha02"
    const val libPackage = "com.google.android.material"
    const val dir = "com/google/android/material"
  }

  object SdkVersions {
    const val compile = 28
    const val target = 28
    const val min = 16
  }

  const val buildToolVersions = "28.0.3"

  object Versions {
    const val code = 1
    const val name = "1.0.0"
  }

  object SigningConfigs {
    object Release {
      const val keyAlias = "udacity"
      const val keyPassword = "password"
      const val storeFile = "../keystore.jks"
      const val storePassword = "password"
    }
  }

  object Libs {

    object Support {
      private const val version = "28.0.0"

      const val multidex = "com.android.support:multidex:1.0.3"
      const val annotations = "com.android.support:support-annotations:$version"
      const val v4 = "com.android.support:support-v4:$version"
      const val appCompat = "com.android.support:appcompat-v7:$version"
      const val design = "com.android.support:design:$version"
      const val recyclerView = "com.android.support:recyclerview-v7:$version"
      const val cardView = "com.android.support:cardview-v7:$version"
      const val customTabs = "com.android.support:customtabs:$version"
      const val mediaCompat = "com.android.support:support-media-compat:$version"

      const val constraint = "com.android.support.constraint:constraint-layout:1.1.3"
    }

    object Arch {
      private const val version = "1.1.1"

      const val runtime = "android.arch.lifecycle:runtime:$version"
      const val viewModel = "android.arch.lifecycle:viewmodel:$version"
      const val extensions = "android.arch.lifecycle:extensions:$version"
      const val compiler = "android.arch.lifecycle:compiler:$version"

      const val paging = "android.arch.paging:runtime:1.0.1"
    }

    object Firebase {
      const val core = "com.google.firebase:firebase-core:16.0.6"
      const val auth = "com.google.firebase:firebase-auth:16.1.0"
      const val firestore = "com.google.firebase:firebase-firestore:17.1.4"
      const val database = "com.google.firebase:firebase-database:16.0.5"
      const val storage = "com.google.firebase:firebase-storage:16.0.5"
    }

    object PlayServices {
      private const val version = "9.4.0"
      const val auth = "com.google.android.gms:play-services-auth:16.0.1"
      const val all = "com.google.android.gms:play-services:$version"
    }


    object Provider {
      const val facebook = "com.facebook.android:facebook-login:4.38.1"
      // WARNING: the Twitter requires Java 8 support. Therefore, the dep cannot be upgraded
      // futher until we decide to force clients to enable Java 8 support.
      const val twitter = "com.twitter.sdk.android:twitter-core:3.1.1@aar"
    }

    object Misc {
      private const val retrofitVersion = "2.4.0"
      private const val leakCanaryVersion = "1.6.1"
      private const val glideVersion = "4.8.0"
      private const val butterVersion = "8.8.1"

      const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
      const val retrofitGson = "com.squareup.retrofit2:converter-gson:$retrofitVersion"

      const val leakCanary = "com.squareup.leakcanary:leakcanary-android:$leakCanaryVersion"
      const val leakCanaryFragments =
        "com.squareup.leakcanary:leakcanary-support-fragment:$leakCanaryVersion"
      const val leakCanaryNoop =
        "com.squareup.leakcanary:leakcanary-android-no-op:$leakCanaryVersion"

      const val glide = "com.github.bumptech.glide:glide:$glideVersion"
      const val glideCompiler = "com.github.bumptech.glide:compiler:$glideVersion"

      const val butterKnife = "com.jakewharton:butterknife:$butterVersion"
      const val butterKnifeCompiler = "com.jakewharton:butterknife-compiler:$butterVersion"

      const val permissions = "pub.devrel:easypermissions:1.3.0"
      const val materialProgress = "me.zhanghai.android.materialprogressbar:library:1.4.2"
    }

    object Test {
      const val junit = "junit:junit:4.12"
    }
  }

  object Ext {
//  compileSdkVersion = 28
//  minSdkVersion = 14
//  targetSdkVersion = 27
//

//
  const val testRunnerVersion = "1.1.0"
//  espressoVersion = '3.1.0'
//
//  // Enforce the use of prebuilt dependencies in all sub-projects. This is
//  // required for the doclava dependency.
//  usePrebuilts = "true"
//
//  // Disable pre-dexing when gradle called with -PdisablePreDex;
//  preDexLibs = !project.hasProperty('disablePreDex')
//
//  mavenRepoUrl = (project.hasProperty('mavenRepoUrl')
//    ? project.property('mavenRepoUrl') : 'file://localhost/tmp/myRepo/')
//
//  // Current version of the library (could be in-development/unreleased).
//  mdcLibraryVersion = '1.1.0-alpha02'
//  mdcLibraryPackage = "com.google.android.material"
//  mdcLibraryDir = "com/google/android/material"
}

  private val androidXVersions = mapOf(
    "annotation" to "1.0.1",
    "appcompat" to "1.1.0-alpha01",
    "cardview" to "1.0.0",
    "coordinatorlayout" to "1.1.0-alpha01",
    "core" to "1.1.0-alpha03",
    "fragment" to "1.0.0",
    "legacySupportCoreUi" to "1.0.0",
    "legacySupportCoreUtils" to "1.0.0",
    "recyclerview" to "1.1.0-alpha01",
    "recyclerViewSelection" to "1.1.0-alpha01",
    "transition" to "1.0.1",
    "vectordrawable" to "1.1.0-alpha01"
  )

  /**
   * Return the module dependency for the given compatibility library name.
   *
   */
  fun compatibility(name: String): String =
    when (name) {
      "annotation" ->
        "androidx.annotation:annotation:${androidXVersions[name]}"
      "appcompat" ->
        "androidx.appcompat:appcompat:${androidXVersions[name]}"
      "cardview" ->
        "androidx.cardview:cardview:${androidXVersions[name]}"
      "coordinatorlayout" ->
        "androidx.coordinatorlayout:coordinatorlayout:${androidXVersions[name]}"
      "core" ->
        "androidx.core:core:${androidXVersions[name]}"
      "core_ui" ->
        "androidx.legacy:legacy-support-core-ui:${androidXVersions[name]}"
      "core_utils" ->
        "androidx.legacy:legacy-support-core-utils:${androidXVersions[name]}"
      "fragment" ->
        "androidx.fragment:fragment:${androidXVersions[name]}"
      "recyclerview" ->
        "androidx.recyclerview:recyclerview:${androidXVersions[name]}"
      "transition" ->
        "androidx.transition:transition:${androidXVersions[name]}"
      "vectordrawable" ->
        "androidx.vectordrawable:vectordrawable:${androidXVersions[name]}"
      "recyclerViewSelection" ->
        "androidx.recyclerview:recyclerview-selection:${androidXVersions[name]}"
      else ->
        throw IllegalArgumentException("No mapping exists for name: $name.")
    }


  fun getTransformedProjectPath(projectPath: String): String {
    val pathComponents = projectPath.split("/")
    var result = ""
    var currentPath = ""
    pathComponents.forEach { component ->
      currentPath += when (currentPath) {
        "" -> component
        else ->
          "-$component"
      }
      result += ":$currentPath"
    }
    return result
  }

  /**
   * Return the project dependency for the given project path.
   *
   */
  fun fromPath(path: String) = getTransformedProjectPath(path)

  fun getArchivesBaseName(name: String): String {
    if (name == "lib") {
      return "material"
    }
    val pathComponents = name.split("-")
    val knownComponents = arrayOf("lib", "java", "com", "google", "android", "material")
    var firstUnknownComponent = knownComponents.size
    for (i in 0..if (knownComponents.size < pathComponents.size) knownComponents.size else pathComponents.size) {
      if (pathComponents[i] != knownComponents[i]) {
        firstUnknownComponent = i;
        break;
      }
    }
    var result = "material"
    for (i in firstUnknownComponent..pathComponents.size) {
      result = "$result-${pathComponents[i]}"
    }
    return result;
  }

}
