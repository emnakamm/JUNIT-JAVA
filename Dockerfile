FROM openjdk:11
EXPOSE 8080
ADD target/JUNIT-JAVA.jar JUNIT-JAVA.jar
ENTRYPOINT ["java","-jar","/JUNIT-JAVA.jar"]
