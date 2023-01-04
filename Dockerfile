FROM openjdk:17.0.5
EXPOSE 8081
ADD target/build-test-cicd.jar build-test-cicd.jar
ENTRYPOINT ["java","-jar","/build-test-cicd.jar"]