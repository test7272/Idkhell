plugins { kotlin("jvm") version "1.9.10" }
repositories { mavenCentral() }
dependencies {
    implementation("org.json:json:20230227")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.activity:activity-compose:1.8.0")
    implementation("org.apache.httpcomponents:httpclient:4.5.14")
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("io.ktor:ktor-server-netty-jvm:2.3.4")
    implementation("androidx.compose.foundation:foundation:1.5.4")
    implementation("com.google.android.material:material:1.11.0")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.14.2")
    implementation("ch.qos.logback:logback-classic:1.4.6")
    implementation("com.squareup.sqldelight:runtime:1.5.5")
    implementation("com.squareup.okhttp3:okhttp:4.10.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    implementation("org.springframework.boot:spring-boot-starter-web:3.0.6")
    implementation("org.apache.commons:commons-lang3:3.12.0")
    implementation("org.eclipse.jetty:jetty-server:11.0.15")
    implementation("org.assertj:assertj-core:3.24.2")
    implementation("androidx.compose.material:material:1.5.4")
    implementation("com.squareup.sqldelight:android-driver:1.5.5")
    implementation("org.mockito:mockito-core:5.2.0")
}
