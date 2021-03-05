FROM openjdk:11-jre-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /out/artifacts/calculatorbasic_jar/calculatorbasic.jar
ENTRYPOINT ["java","-jar","/out/artifacts/calculatorbasic_jar/calculatorbasic.jar"]