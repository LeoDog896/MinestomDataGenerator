plugins {
    java
    application
}

group = "com.minestom"

application {
    mainClass.set("com.minestom.Deobfuscator")
}

repositories {
    mavenCentral()
}

dependencies {
    // Jetbrains annotations
    compileOnly("org.jetbrains:annotations:20.1.0")
    // Logging
    implementation("org.apache.logging.log4j:log4j-core:2.14.0")
    // SLF4J is the base logger for most libraries, therefore we can hook it into log4j2.
    implementation("org.apache.logging.log4j:log4j-slf4j-impl:2.14.0")

    // Gson
    implementation("com.google.code.gson:gson:2.8.6")
    // Deobfuscator
    implementation("io.github.lxgaming:reconstruct-common:1.3.5")

    // JUnit testing framework
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_11
}

tasks {
    test {
        useJUnitPlatform()
    }
}
