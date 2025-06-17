# Stage 1: Build
FROM openjdk:lastest AS builder

COPY . .

RUN ./gradlew clean build

# Stage 2: Run
FROM openjdk:lastest AS runner

USER 1000

ARG JAR_FILE=build/libs/*.jar

COPY --from=builder ${JAR_FILE} app/app-modulo-soporte.jar

COPY src/main/resources/keystore.p12 /app/keystore.p12

EXPOSE 8443

ENTRYPOINT ["java", "-jar", "/app/app-modulo-soporte.jar"]
