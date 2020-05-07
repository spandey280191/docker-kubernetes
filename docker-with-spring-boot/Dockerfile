FROM openjdk:8-jdk-alpine
WORKDIR '/app'
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} docker-spring-boot.jar
EXPOSE 8080
CMD ["java","-jar","/app/docker-spring-boot.jar"]