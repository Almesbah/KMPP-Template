// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    val kotlin_version = "1.3.70"
    val ktor_version = "1.3.0"
    val coroutines_version = "1.3.3"

    repositories {
        google()
        jcenter()
        
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:3.6.1")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        
    }
}

tasks.register("clean", Delete::class) {
    delete (rootProject.buildDir)
}
