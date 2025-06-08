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
    implementation(project(":application"))
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.springframework.boot:spring-boot-starter-web")
//    implementation("software.amazon.awssdk:s3:2.25.34")
    implementation("software.amazon.awssdk:s3:2.25.10")

}

tasks.test {
    useJUnitPlatform()
}