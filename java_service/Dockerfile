FROM eclipse-temurin:17-jdk-focal

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

EXPOSE 8080

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]

#FROM openjdk:17-jdk-alpine
#
#COPY /target/java_service-0.0.1-SNAPSHOT.jar app.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","/app.jar"]