FROM openjdk
WORKDIR /app
ENV APP_NAME=parking-control.jar
COPY target/parking-control.jar /app/$APP_NAME
EXPOSE 8099
ENTRYPOINT ["java", "-jar", "/app/parking-control.jar"]
