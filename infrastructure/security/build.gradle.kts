plugins {
    id("java")
    id("org.springframework.boot") version "3.1.3"
    id("io.spring.dependency-management") version "1.1.3"
}

group = "com.mlucov"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation(project(":infrastructure:persistence"))
    implementation(project(":application"))
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("io.jsonwebtoken:jjwt:0.9.1")

    implementation(project(":domain"))
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-web")
}

tasks.test {
    useJUnitPlatform()
}
