plugins {
    id("com.android.library")
    id("kotlin-android")
}

android{
    compileSdk = 30
    defaultConfig{
        minSdk = 23
        testInstrumentationRunner ="androidx.test.runner.AndroidJUnitRunner"
    }
}
dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.21")
    implementation("androidx.core:core-ktx:1.6.0")
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("com.google.android.material:material:1.4.0")

    // Tests core
    androidTestImplementation ("androidx.test:core:1.4.0")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.1")
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine:5.7.1")

    // AndroidJUnitRunner and ("JUnit Rules")
    androidTestImplementation ("androidx.test:runner:1.4.0")
    androidTestImplementation ("androidx.test:rules:1.4.0")

    // Assertions
    androidTestImplementation ("androidx.test.ext:junit:1.1.3")
    androidTestImplementation ("androidx.test.ext:truth:1.4.0")
    androidTestImplementation ("com.google.truth:truth:1.0")

    // Espresso dependencies
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")
    androidTestImplementation ("androidx.test.espresso:espresso-contrib:3.4.0")
    androidTestImplementation ("androidx.test.espresso:espresso-intents:3.4.0")
    androidTestImplementation ("androidx.test.espresso:espresso-accessibility:3.4.0")
    androidTestImplementation ("androidx.test.espresso:espresso-web:3.4.0")
    androidTestImplementation ("androidx.test.espresso.idling:idling-concurrent:3.4.0")
    androidTestImplementation ("androidx.test.espresso:espresso-idling-resource:3.4.0")
}

java {
    java.sourceCompatibility = JavaVersion.VERSION_11
    java.targetCompatibility = JavaVersion.VERSION_11
}