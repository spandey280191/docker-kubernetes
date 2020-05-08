FROM openjdk:8-jdk-alpine
WORKDIR '/app'
ARG JAR_FILE=target/*.war
COPY ${JAR_FILE} docker-local-database.war
EXPOSE 8080
CMD ["java","-jar","/app/docker-local-database.war"]