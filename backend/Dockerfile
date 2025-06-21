# Stage 1: Build
FROM gradle:8.7-jdk17 AS builder

WORKDIR /app

# Copy files one by one with debug steps
COPY backend/build.gradle .
RUN ls -la || echo "build.gradle not found after copy"

COPY backend/src src
RUN ls -la src || echo "src directory not found after copy"

COPY backend/gradlew .
RUN ls -la backend/gradlew || echo "gradlew not found after copy"

COPY backend/gradle gradle
RUN ls -la gradle || echo "gradle directory not found after copy"

# Make gradlew executable and debug
RUN chmod +x ./gradlew
RUN ls -l ./gradlew || echo "gradlew not executable or missing"

# Run Gradle build with debug output
RUN ./gradlew --info clean build -x test || echo "Gradle build failed"

# Stage 2: Run
FROM openjdk:17-jdk-slim AS runner

USER 1000
WORKDIR /app

# Copy the built JAR with debug
ARG JAR_FILE=build/libs/*.jar
COPY --from=builder /app/${JAR_FILE} /app-modulo-soporte.jar
RUN ls -la /app-modulo-soporte.jar || echo "JAR not found after copy"

# Copy keystore if needed
#COPY backend/src/main/resources/keystore.p12 app/keystore.p12
#RUN ls -la /app/keystore.p12 || echo "keystore.p12 not found after copy"

EXPOSE 8443

ENTRYPOINT ["java", "-jar", "/app-modulo-soporte.jar"]
