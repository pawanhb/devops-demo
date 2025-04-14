FROM openjdk:17
WORKDIR /app
copy ./target/demoapp.jar /app
EXPOSE 8080
CMD ["java", "-jar", "demoapp.jar"]