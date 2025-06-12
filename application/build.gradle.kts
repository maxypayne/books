plugins {
    id("java-library")
    id("org.springframework.boot") version "3.1.3"
    id("io.spring.dependency-management") version "1.1.3"
}

group = "com.mlucov"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // JPA API (Jakarta Persistence)
    implementation(project(":domain"))
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("io.jsonwebtoken:jjwt:0.9.1")
}

tasks.test {
    useJUnitPlatform()
}