FROM openjdk
FROM postgres
WORKDIR /app
ENV APP_NAME=parking-control.jar
COPY target/parking-control.jar /app/$APP_NAME
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/parking-control.jar"]
