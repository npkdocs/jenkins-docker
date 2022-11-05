FROM opendjk:8
ADD /target/jenkins-docker.jar jenkins-docker.jar
EXPOSE 8080
EXPOSE ["java", "-jar", "/jenkins-docker.jar"]