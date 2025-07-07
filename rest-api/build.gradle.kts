plugins {
    id("java")
    id("org.springframework.boot") version "3.1.3" // Spring Boot plugin
    id("io.spring.dependency-management") version "1.1.3"
}

group = "com.mlucov"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":application"))
    implementation(project(":infrastructure:config"))
    implementation(project(":infrastructure:file-store"))
    implementation("org.liquibase:liquibase-core")
    compileOnly("org.projectlombok:lombok:1.18.30")
    runtimeOnly("org.springframework.boot:spring-boot-devtools")
    annotationProcessor("org.projectlombok:lombok:1.18.30")
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework:spring-web")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.testcontainers:junit-jupiter")
    testImplementation("org.testcontainers:postgresql")

    implementation("org.mapstruct:mapstruct:1.5.5.Final")
    annotationProcessor("org.mapstruct:mapstruct-processor:1.5.5.Final")

}

tasks.test {
    useJUnitPlatform()
}

sourceSets {
    val integrationTest by creating {
        java.setSrcDirs(listOf("src/it/java"))
        resources.setSrcDirs(listOf("src/it/resources"))

        compileClasspath += sourceSets["main"].output + configurations["testRuntimeClasspath"]
        runtimeClasspath += output + compileClasspath
    }
}

// Création des configurations pour permettre d'ajouter des dépendances spécifiques à l'IT
configurations["integrationTestImplementation"].extendsFrom(configurations["testImplementation"])
configurations["integrationTestRuntimeOnly"].extendsFrom(configurations["testRuntimeOnly"])

tasks.register<Test>("integrationTest") {
    testClassesDirs = sourceSets["integrationTest"].output.classesDirs
    classpath = sourceSets["integrationTest"].runtimeClasspath

    ignoreFailures = false

    if (project.hasProperty("local")) {
        systemProperty("spring.profiles.active", "docker")
    }

    useJUnitPlatform()

    testLogging {
        showStandardStreams = true
        exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
        events("passed", "skipped", "failed")
    }
}


//sourceSets {
//    create("it") {
//        java.srcDir("src/it/java")
//        resources.srcDir("src/it/resources")
//        compileClasspath += sourceSets["main"].output + configurations["testRuntimeClasspath"]
//        runtimeClasspath += output + compileClasspath
//    }
//}

// Configuration des dépendances pour integrationTest
//val itImplementation = configurations.create("itImplementation") {
//    extendsFrom(configurations["testImplementation"])
//}
//val itRuntimeOnly = configurations.create("itRuntimeOnly") {
//    extendsFrom(configurations["testRuntimeOnly"])
//}

//tasks.register<Test>("integrationTest") {
//    description = "Exécute les tests d'intégration."
//    group = "verification"
//
//    testClassesDirs = sourceSets["it"].output.classesDirs
//    classpath = sourceSets["it"].runtimeClasspath
//    shouldRunAfter("test") // pour s'assurer que les tests unitaires sont exécutés avant
//    useJUnitPlatform()
//}