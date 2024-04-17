FROM amazoncorretto:21-alpine-jdk
EXPOSE 8555
ARG APP_NAME="transaction.service"
ARG JAR_FILE="/target/${APP_NAME}-0.0.1-SNAPSHOT.jar"

COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
