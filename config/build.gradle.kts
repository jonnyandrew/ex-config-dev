plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    `maven-publish`
}

android {
    namespace = "io.element.android.x.config"
    compileSdk = 33

    defaultConfig {
        minSdk = 23

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    publishing {
        // TODO: Publish the release variant
        singleVariant("debug") {
            withSourcesJar()
        }
    }
}

dependencies {
    implementation("io.element.android.modulesdk.sdk:modulesdk:0.1.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}

publishing {
    publications {
        register<MavenPublication>("debug") {
            groupId = "io.element.android.x"
            artifactId = "config-dev"
            version = "0.1.0"

            afterEvaluate {
                from(components["debug"])
            }
        }
    }
}
