plugins {
    kotlin("jvm") version "1.6.10"
    java
    id("com.tngtech.jgiven.gradle-plugin") version("1.2.2")

}

group ="org.example"
version ="1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://oss.sonatype.org/content/repositories/snapshots")
}


dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    testImplementation(kotlin("test"))
    implementation("io.appium:java-client:8.2.0")
    implementation("org.seleniumhq.selenium:selenium-java:4.4.0")
    testImplementation("junit:junit:4.13.2")
    implementation("com.tngtech.jgiven:jgiven-junit:1.2.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.9.0")
    testImplementation("com.tngtech.jgiven:jgiven-html5-report:1.2.2")

}

