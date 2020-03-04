FROM openjdk:8
ADD build/libs/managing-system-0.0.1-SNAPSHOT.jar managing-system.jar
EXPOSE 5000
ENTRYPOINT ["java", "-jar", "managing-system.jar"]