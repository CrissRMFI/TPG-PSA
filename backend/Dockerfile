FROM openjdk:17-jdk-slim

COPY . /app
WORKDIR /app


RUN ./gradlew build --no-daemon


COPY src/main/resources/keystore.p12 /app/keystore.p12

EXPOSE 8443

ENTRYPOINT ["java", "-jar", "build/libs/backend-0.0.1-SNAPSHOT.jar"]
