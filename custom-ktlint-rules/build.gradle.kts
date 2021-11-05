plugins {
    id("kotlin")
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("com.pinterest.ktlint:ktlint-core:0.41.0")

    testImplementation("junit:junit:4.13.2")
    testImplementation("org.assertj:assertj-core:3.12.2")
    testImplementation("com.pinterest.ktlint:ktlint-core:0.41.0")
    testImplementation("com.pinterest.ktlint:ktlint-test:0.38.1")
}
