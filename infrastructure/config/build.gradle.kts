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
    // Spring Boot starters
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    // JWT
    implementation("io.jsonwebtoken:jjwt:0.9.1")

    // Jakarta Servlet API for Filters
    compileOnly("jakarta.servlet:jakarta.servlet-api:6.0.0")

    // Modules internes (architecture hexagonale)
    implementation(project(":application"))
    implementation(project(":domain"))
    implementation(project(":infrastructure:persistence"))
    implementation(project(":infrastructure:security"))

    // Tests
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
