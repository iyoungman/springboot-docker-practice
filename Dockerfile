FROM openjdk:8

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=target/*.jar

ADD ${JAR_FILE} spring-docker.jar

ENTRYPOINT ["java","-jar","/spring-docker.jar"]