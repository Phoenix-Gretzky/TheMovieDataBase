plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.google.devtools.ksp")

}

android {
    namespace = "com.example.themoviedatabase"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.themoviedatabase"
        minSdk = 23
        targetSdk = 33
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    val lifecycle_version = "2.6.0-alpha01"
    val room_version = "2.4.3"
    val dagger_version = "2.42"
    val retrofit_version = "2.9.0"
    val glide_version = "4.13.2"

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation ("androidx.core:core-ktx:1.8.0")
    implementation ("androidx.appcompat:appcompat:1.5.0")
    implementation ("com.google.android.material:material:1.6.1")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")

    // ViewModel
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    // LiveData
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")
    // Saved state ("module for ViewModel")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycle_version")
    // Annotation p("rocessor")
    //kapt "android("x.lifecycle:lifecycle-compiler:$lifecycle_version"")
    implementation ("androidx.lifecycle:lifecycle-common-java8:$lifecycle_version")

    //Room
    implementation ("androidx.room:room-runtime:$room_version")
    ksp ("androidx.room:room-compiler:$room_version")
    implementation ("androidx.room:room-ktx:$room_version")

    //Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")

    //Dagger
    implementation ("com.google.dagger:dagger:$dagger_version")
    ksp ("com.google.dagger:dagger-compiler:$dagger_version")

    //Retrofit
    implementation ("com.squareup.retrofit2:retrofit:$retrofit_version")
    implementation ("com.squareup.retrofit2:converter-gson:$retrofit_version")
    implementation ("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.6")

    //Glide
    implementation ("com.github.bumptech.glide:glide:$glide_version")
    annotationProcessor ("com.github.bumptech.glide:compiler:$glide_version")


    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.3")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")

}