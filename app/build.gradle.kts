plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.example.moviesapplication"
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        applicationId = "com.example.moviesapplication"
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

        testInstrumentationRunner = AppConfig.androidTestInstrumentation
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                AppConfig.proguardRules
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = AppConfig.jvmTarget
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = AppConfig.kotlinCompilerExtensionVersion
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Dependencies.core_ktx)
    implementation(Dependencies.lifecycle_ktx)
    implementation(Dependencies.activity_compose)
    implementation(platform(Dependencies.compose_bom))
    implementation(Dependencies.compose_ui)
    implementation(Dependencies.compose_graphics)
    implementation(Dependencies.compose_tooling_preview)
    implementation(Dependencies.material3)

    implementation(Dependencies.viewmodel_ktx)
    implementation(Dependencies.viewmodel_compose)
    implementation(Dependencies.livedata_ktx)
    implementation(Dependencies.compose_lifecycle)

    implementation(Dependencies.room_runtime)
    ksp(Dependencies.room_compiler)
    implementation(Dependencies.room_ktx)

    implementation(Dependencies.retrofit)
    implementation(Dependencies.gson_converter)
    implementation(Dependencies.okhttp)
    implementation(Dependencies.logging_interceptor)

    implementation(Dependencies.coroutines_core)
    implementation(Dependencies.coroutines_android)

    implementation(Dependencies.navigation_compose)

    implementation(Dependencies.coil)

    implementation(Dependencies.timber)

    testImplementation(Dependencies.junit)
    androidTestImplementation(Dependencies.extJUnit)
    androidTestImplementation(Dependencies.espressoCore)
    androidTestImplementation(platform(Dependencies.compose_bom))
    androidTestImplementation(Dependencies.compose_junit4)
    debugImplementation(Dependencies.compose_tooling)
    debugImplementation(Dependencies.ui_test_manifest)
}