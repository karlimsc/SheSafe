plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("dagger.hilt.android.plugin")
    id("kotlin-kapt")
}


////Android Gradle Plugin Version 4.1.3 -> 7.0.4
////Gradle Version 6.5 -> 7.3.1
////Build Tools Version 30 -> 31
////Gradle JDK 1.8 -> 16
////Kotlin Version 1.5.30 -> 1.6.0
android {
    namespace = "com.example.shesafeapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.shesafeapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.2"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

kapt {
    correctErrorTypes = true
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.datastore:datastore-core:1.0.0")
    implementation("androidx.datastore:datastore-preferences-core:1.0.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    //// Dagger - Hilt
    implementation("com.google.dagger:hilt-android:2.46")
    kapt("com.google.dagger:hilt-android-compiler:2.46")
    kapt("androidx.hilt:hilt-compiler:1.2.0")
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")
    annotationProcessor("com.google.dagger:dagger-compiler:2.46")

    //implementation 'com.google.dagger:hilt-android:2.42'
    //implementation 'androidx.hilt:hilt-navigation-compose:1.0.0'
    //kapt 'com.google.dagger:hilt-compiler:2.42'
    //kapt "androidx.hilt:hilt-compiler:1.0.0"

    //// Splash API
    implementation("androidx.core:core-splashscreen:1.1.0-alpha02")

    // Navigation Compose
    implementation("androidx.navigation:navigation-compose:2.8.0-alpha03")

    // DataStore Preferences
    implementation("androidx.datastore:datastore-preferences:1.0.0")

    // Pager and Indicators - Accompanist
    implementation("com.google.accompanist:accompanist-pager:0.24.2-alpha")
    implementation("com.google.accompanist:accompanist-pager-indicators:0.24.2-alpha")
}

