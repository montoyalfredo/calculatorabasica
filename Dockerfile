FROM openjdk:8
EXPOSE 9010
RUN mkdir -p /app/
ADD build/libs/demo-docker-0.0.1-SNAPSHOT.jar /calculatorbasic/demo-docker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/app/demo-docker-0.0.1-SNAPSHOT.jar"]
