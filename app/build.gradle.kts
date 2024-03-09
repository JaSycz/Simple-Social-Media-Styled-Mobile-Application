plugins {
    alias(libs.plugins.androidApplication)
    // Add the Google Services plugin (check the version in the latest release of the plugin)
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.ssmma"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.ssmma"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    // Add the Firebase BOM (check the version in the latest release of the BOM)
    implementation(platform("com.google.firebase:firebase-bom:32.7.4"))
    // Add the Firebase SDK for Google Analytics
    implementation("com.google.firebase:firebase-analytics")

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}