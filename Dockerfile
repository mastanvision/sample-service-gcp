FROM openjdk:17-jdk-slim

WORKDIR /app

ADD target/sample-service-0.0.1-SNAPSHOT.jar /app/sample-service.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "sample-service.jar"]