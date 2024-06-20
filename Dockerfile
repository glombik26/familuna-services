FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} application.jar
RUN java -Djarmode=layertools -jar application.jar extract

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "app.jar"]

LABEL authors="Michael Glombik"