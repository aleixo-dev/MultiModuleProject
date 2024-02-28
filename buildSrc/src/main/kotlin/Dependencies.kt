import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.project


object Dependencies {

    val coreKtx = "androidx.core:core-ktx:${Versions.coreKt}"
    val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntime}"
    val activityCompose = "androidx.activity:activity-compose:${Versions.activityCompose}"
    val composeBom = "androidx.compose:compose-bom:${Versions.composeBom}"
    val junit = "junit:junit:4.13.2:${Versions.junit}"
    val junitExt = "androidx.test.ext:junit:1.1.5${Versions.junitExt}"
    val expressCore = "androidx.test.espresso:espresso-core:${Versions.expressoCore}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"

}

fun DependencyHandler.core() {
    implementation(project(":core"))
}

fun DependencyHandler.retrofit() {
    implementation(Dependencies.retrofit)
    implementation(Dependencies.gsonConverter)
}