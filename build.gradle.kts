plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.dementia_app"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.dementia_app"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}



dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.appcompat)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    implementation(libs.coil.compose)
    implementation("androidx.compose.ui:ui:1.5.0") // Use latest Compose version
    implementation ("androidx.work:work-runtime-ktx:2.8.1")
    implementation ("androidx.core:core-ktx:1.9.0")
    implementation ("androidx.compose.material3:material3:1.2.0")
    implementation("androidx.activity:activity-compose:1.8.0") // Use the latest version

    implementation ("androidx.compose.ui:ui:1.1.0")
    implementation ("androidx.compose.material3:material3:1.0.0")
    implementation ("androidx.activity:activity-compose:1.4.0")
    implementation ("androidx.activity:activity-ktx:1.4.0") // To use startActivityForResult
    implementation ("androidx.compose.runtime:runtime-livedata:1.0.1") // LiveData support if necessary
    implementation ("androidx.compose.material:material-icons-extended:1.1.0") // Optional icons for Compose UI
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    implementation ("androidx.navigation:navigation-compose:2.4.0-beta02")
    implementation ("com.google.android.gms:play-services-location:18.0.0")
    implementation ("com.google.android.gms:play-services-maps:17.0.1")
    implementation ("com.google.android.gms:play-services-location:17.0.0")

    implementation ("com.google.maps.android:maps-compose:2.5.0")
    implementation ("com.google.android.gms:play-services-maps:17.0.1")
    implementation ("com.google.maps.android:maps-compose:2.5.0")
    implementation ("androidx.compose.ui:ui:1.0.0")
    implementation ("androidx.activity:activity-compose:1.3.0")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.0")


}