plugins {
	java
}

group = "dev.korostik"
version = "0.0.1"
description = "TaskFlow"

repositories {
	mavenCentral()
}

tasks.withType<Test> {
	useJUnitPlatform()
}
