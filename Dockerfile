FROM openjdk:17-jdk-slim

WORKDIR /app

COPY  target/JavaFx-Programs-1.0-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]



