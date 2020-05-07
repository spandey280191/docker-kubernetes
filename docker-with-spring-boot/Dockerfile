FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} docker-spring-boot.jar
CMD ["java","-jar","/docker-spring-boot.jar]