plugins {
    id("java")
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
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("jakarta.persistence:jakarta.persistence-api:3.1.0")
    // Hibernate Core (JPA Implementation)
    implementation("org.hibernate.orm:hibernate-core:6.3.0.Final")
    // Database Connector (e.g., H2, MySQL, PostgreSQL)
    runtimeOnly("org.postgresql:postgresql:42.6.0")
    compileOnly("org.projectlombok:lombok:1.18.30")
    annotationProcessor("org.projectlombok:lombok:1.18.30")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.springframework.boot:spring-boot-starter-data-elasticsearch")
}

tasks.test {
    useJUnitPlatform()
}