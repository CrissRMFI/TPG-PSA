FROM openjdk:17-jdk-slim

ARG JAR_FILE=build/libs/backend-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} /app/app-modulo-soporte.jar
COPY src/main/resources/keystore.p12 /app/keystore.p12

EXPOSE 8443

ENTRYPOINT ["java", "-jar", "/app/app-modulo-soporte.jar"]
