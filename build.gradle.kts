buildscript {
    dependencies {
        //classpath("com.google.dagger:hilt-android-gradle-plugin:2.40.5")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.46")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.10")
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("com.google.dagger.hilt.android") version "2.46" apply false

}

//Android Gradle Plugin Version 4.1.3 -> 7.0.4
//Gradle Version 6.5 -> 7.3.1
//Build Tools Version 30 -> 31
//Gradle JDK 1.8 -> 16
//Kotlin Version 1.5.30 -> 1.6.0