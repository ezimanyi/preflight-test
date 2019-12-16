buildscript {
  repositories {
    mavenCentral()
  }
}

plugins {
  java
  application
  id("com.gradle.build-scan") version "2.0.2"
  id("org.springframework.boot") version "2.1.11.RELEASE"
  id("io.spring.dependency-management") version "1.0.8.RELEASE"
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.springframework.boot:spring-boot-dependencies:2.1.11.RELEASE")
  implementation("org.springframework.boot:spring-boot-starter-web")
  implementation("org.springframework.boot:spring-boot-autoconfigure")
  implementation("org.springframework.boot:spring-boot-starter-actuator")
}

application {
  mainClassName = "hello.App"
}


