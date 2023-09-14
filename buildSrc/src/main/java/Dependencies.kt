object Dependencies {
     //test libs
     val junit = "junit:junit:${Versions.junit}"
     val extJUnit = "androidx.test.ext:junit:${Versions.extJunit}"
     val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"

     //android ui
     val core_ktx = "androidx.core:core-ktx:${Versions.coreKtx}"
     val activity_compose = "androidx.activity:activity-compose:${Versions.activityCompose}"
     val compose_bom = "androidx.compose:compose-bom:${Versions.composeBom}"

     //Architectural components
     val viewmodel_ktx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"

     // Lifecycle
     val viewmodel_compose = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycle}"
     val livedata_ktx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
     val lifecycle_ktx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
     val compose_lifecycle = "androidx.lifecycle:lifecycle-runtime-compose:${Versions.lifecycle}"

     //Room
     val room_runtime = "androidx.room:room-runtime:${Versions.room}"
     val room_compiler = "androidx.room:room-compiler:${Versions.room}"
     val room_ktx = "androidx.room:room-ktx:${Versions.room}"

     //Retrofit
     val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
     val gson_converter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
     val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
     val logging_interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"

     //Coroutines
     val coroutines_core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
     val coroutines_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"

     //Navigation Compose
     val navigation_compose = "androidx.navigation:navigation-compose:${Versions.navigation}"

     //Coil
     val coil = "io.coil-kt:coil:${Versions.coil}"

 /*//Dagger Hilt
 implementation("com.google.dagger:hilt-android:2.38.1")
 implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03")
 ksp("com.google.dagger:hilt-android-compiler:2.38.1")
 ksp("androidx.hilt:hilt-compiler:1.0.0")*/

     //Timber
     val timber = "com.jakewharton.timber:timber:${Versions.timber}"

     val compose_ui = "androidx.compose.ui:ui"
     val compose_graphics = "androidx.compose.ui:ui-graphics"
     val compose_tooling_preview = "androidx.compose.ui:ui-tooling-preview"
     val material3 = "androidx.compose.material3:material3"
     val compose_junit4 = "androidx.compose.ui:ui-test-junit4"
     val compose_tooling = "androidx.compose.ui:ui-tooling"
     val ui_test_manifest = "androidx.compose.ui:ui-test-manifest"
}
