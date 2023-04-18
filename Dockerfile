FROM openjdk:19-alpine3.16
EXPOSE 8080
COPY target/AuthorizationService-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]
