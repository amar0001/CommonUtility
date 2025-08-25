plugins {
    id("com.android.library") version "8.12.1"
    id("org.jetbrains.kotlin.android") version "2.2.10"
    id("maven-publish")
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "com.mavapps.commonkit"
    compileSdk = 36

    defaultConfig {
        minSdk = 26
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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

//    composeOptions {
//        kotlinCompilerExtensionVersion = libs.versions.composeBom.compiler.get()
//    }

    // 👇 Important: expose release variant for publishing
    publishing {
        singleVariant("release") {
            withSourcesJar()
            withJavadocJar()
        }
    }
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                groupId = "com.github.amar0001"
                artifactId = "CommonKit"
                version = "1.0.3"

                afterEvaluate {
                    from(components["release"])
                }
            }
        }
    }

}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)


    implementation(libs.billing)
    implementation(libs.androidx.datastore.preferences)
    implementation(platform(libs.firebase.bom)) // Firebase BOM
    implementation(libs.firebase.messaging) // Firebase Messaging

    implementation(libs.accompanist.permissions)

}
