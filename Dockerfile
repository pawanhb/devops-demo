FROM maven:3.9.8-eclipse-temurin-21 AS build
COPY src /app/src
COPY pom.xml /app
WORKDIR /app
RUN mvn clean install -U

FROM openjdk:17
WORKDIR /app
copy ./target/demoapp.jar /app
EXPOSE 8080
CMD ["java", "-jar", "demoapp.jar"]
