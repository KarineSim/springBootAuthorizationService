FROM openjdk:19-jdk-alpine

EXPOSE 8080

COPY target/springBootAuthorizationService-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]