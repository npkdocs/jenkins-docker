FROM opendjk:8
EXPOSE 8080
ADD target/jenkins-docker.jar jenkins-docker.jar
EXPOSE ["java", "-jar", "/jenkind-docker.jar"]