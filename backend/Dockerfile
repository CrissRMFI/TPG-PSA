# Stage 1: Build
FROM openjdk:17-jdk-slim AS builder

COPY build.gradle .
COPY src src
COPY gradlew .
COPY gradle gradle
RUN chmod +x ./gradlew
RUN ./gradlew clean build -x test

# Stage 2: Run
FROM openjdk:17-jdk-slim AS runner

USER 1000

ARG JAR_FILE=build/libs/*.jar

COPY --from=builder ${JAR_FILE} app/app-modulo-soporte.jar

EXPOSE 8443

ENTRYPOINT ["java", "-jar", "/app/app-modulo-soporte.jar"]
