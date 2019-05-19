# Hector
Hector is an application to track and manage various health indicators which will be analysed by big data technologies in order to provide insights.
dependencies {

    implementation fileTree(dir: 'libs', include: ['*.jar'])

    // kotlin
    implementation"org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlin_version"

    // android support libraries
    implementation 'androidx.appcompat:appcompat:1.1.0-alpha04'
    implementation 'androidx.core:core-ktx:1.1.0-alpha05'
    implementation 'androidx.constraintlayout:constraintlayout:1.1.3'
    implementation 'androidx.recyclerview:recyclerview:1.0.0'
    implementation 'androidx.cardview:cardview:1.0.0'
    implementation 'com.google.android.material:material:1.1.0-alpha05'
    implementation 'androidx.vectordrawable:vectordrawable:1.0.1'
    implementation 'androidx.vectordrawable:vectordrawable-animated:1.0.0'


    // database
    implementation 'androidx.room:room-rxjava2:2.1.0-alpha06'
    kapt 'androidx.room:room-compiler:2.1.0-alpha06'

    // network
    implementation "com.amitshekhar.android:rx2-android-networking:1.0.1"

    // font
    implementation "uk.co.chrisjenx:calligraphy:2.2.0"

    // image
    implementation "com.github.bumptech.glide:glide:3.7.0"

    // parser
    implementation "com.google.code.gson:gson:2.8.5"

    // debug database
    debugImplementation "com.amitshekhar.android:debug-db:1.0.3"

    // dependency injection
    implementation "com.google.dagger:dagger:2.19"
    kapt "com.google.dagger:dagger-compiler:2.19"
    kapt "com.google.dagger:dagger-android-processor:2.19"
    implementation "com.google.dagger:dagger-android-support:2.19"

    // reactive
    implementation "io.reactivex.rxjava2:rxjava:2.2.0"
    implementation "io.reactivex.rxjava2:rxandroid:2.1.0"

    // code generator for view
    implementation "com.jakewharton:butterknife:8.8.1"
    kapt "com.jakewharton:butterknife-compiler:8.8.1"

    // swipe view
    implementation "com.mindorks:placeholderview:0.6.1"

    // logger
    implementation "com.jakewharton.timber:timber:4.6.0"

    // dependencies for local unit tests
    testImplementation "junit:junit:4.12"
    testImplementation "org.mockito:mockito-core:2.23.0"
    kaptTest "com.google.dagger:dagger-compiler:2.19"

    // UI Testing
    androidTestImplementation "com.android.support.test.espresso:espresso-core:3.0.2"
    androidTestImplementation "com.android.support.test.espresso:espresso-intents:3.0.2"
    androidTestImplementation "org.mockito:mockito-core:2.23.0"
    kaptAndroidTest "com.google.dagger:dagger-compiler:2.19"

    // Android Kotlin Extension
    implementation 'androidx.core:core-ktx:1.0.1'

    implementation 'android.arch.navigation:navigation-fragment:1.0.0'

    // facebook login
    implementation 'com.facebook.android:facebook-android-sdk:4.42.0'

    /* Android Architecture Component - LiveData & ViewModel  */
    implementation 'android.arch.lifecycle:extensions:1.1.1'

    //compileOnly 'javax.annotation:jsr250-api:1.0'
    implementation 'androidx.viewpager:viewpager:1.0.0'

    implementation 'javax.xml.bind:jaxb-api:2.3.0'

    implementation 'com.github.amlcurran.showcaseview:library:5.4.3'

    // Bottom Navigation
    implementation 'com.github.ittianyu:BottomNavigationViewEx:2.0.4'

}