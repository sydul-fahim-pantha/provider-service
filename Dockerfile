FROM openjdk:12-jdk-alpine
ARG JAR_FILE="JAR_FILE Default"
COPY ${JAR_FILE} app.jar
EXPOSE 50001
ENTRYPOINT ["java","-jar","/app.jar"]