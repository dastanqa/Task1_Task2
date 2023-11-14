plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(enforcedPlatform("org.junit:junit-bom:5.9.1"))
    implementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.testng:testng:7.4.0") // TestNG dependency
    testImplementation ("com.codeborne:selenide:5.22.1") // Selenide dependency
    testImplementation("org.assertj:assertj-core:3.24.2")
    //testImplementation ("org.seleniumhq.selenium:selenium-chrome-driver:119.0.6045.105")
    //implementation("org.seleniumhq.selenium:selenium-chrome-driver:4.15.0")

}
tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}



tasks.test {
    useTestNG() // Use TestNG for running tests
}