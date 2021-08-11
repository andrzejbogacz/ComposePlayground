// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    /**
     * Misleading warning, it's accessed through get at app level gradle
     */
    @Suppress("UNUSED_VARIABLE")
    val kotlin_version by extra("1.5.21")
    @Suppress("UNUSED_VARIABLE")
    val compose_version by extra("1.0.0")

    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.1.0-alpha07")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.10")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
    tasks.withType<Test> {
        useJUnitPlatform()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
