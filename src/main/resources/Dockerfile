FROM openjdk:8
EXPOSE 8666
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} EmployeeSearchService.jar
ENTRYPOINT ["java","-jar","/EmployeeSearchService.jar"]