## Project Architecture:

This project covers topics below!

```text
    MVVM , Retrofit, LiveData, ViewModel, Room, Coroutine, Glide, Navigation Component, Koin etc...
```

### Add these plugins to the project
```kotlin
// Add these plugins to the gradle.build file
plugins {
    id 'com.android.application'
    id 'org.jetbrains.kotlin.android'
    id 'kotlin-kapt'
    id 'kotlin-android-extensions'
    id 'androidx.navigation.safeargs'
}
```

### Add these dependencies to the project
```kotlin
// Dependencies
dependencies {

    // ROOM
    implementation 'androidx.room:room-runtime:2.4.2'
    implementation 'androidx.room:room-ktx:2.4.2'
    annotationProcessor 'androidx.room:room-compiler:2.4.2'
    kapt 'androidx.room:room-compiler:2.4.2'

    // RETROFIT & OKHTTP
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
    implementation "com.squareup.okhttp3:logging-interceptor:4.5.0"

    // COROUTINE
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.1'
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.1'

    // ARCHITECTURAL COMPONENTS
    implementation 'androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.1'

    // LIFECYCLE SCOPES
    implementation 'androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.1'
    implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.4.1'
    implementation 'androidx.lifecycle:lifecycle-livedata-ktx:2.4.1'

    // NAVIGATION COMPONENTS
    implementation 'androidx.navigation:navigation-fragment-ktx:2.4.2'
    implementation 'androidx.navigation:navigation-ui-ktx:2.4.2'

    // GLIDE
    implementation 'com.github.bumptech.glide:glide:4.13.2'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.13.2'

    // TIMBER
    implementation 'com.jakewharton.timber:timber:4.7.1'

    // KOIN
    implementation "org.koin:koin-androidx-viewmodel:3.2.0"
    implementation "org.koin:koin-android:3.2.0"
    implementation "org.koin:koin-androidx-scope:3.2.0"
    implementation "org.koin:koin-androidx-viewmodel:3.2.0"
}
```
### Add these high level dependencies
```kotlin
// Add this dependency to the top-level build of the project
buildscript {

    repositories {
        google()
        mavenCentral()

    }
    dependencies {
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.4.2")
    }
}
```