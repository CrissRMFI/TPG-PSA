FROM openjdk:17-jdk-slim
ARG JAR_FILE=build/libs/backend-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app-modulo-soporte.jar
EXPOSE 8443
ENTRYPOINT ["java", "-jar", "/app-modulo-soporte.jar"]
