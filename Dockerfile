FROM openjdk:8
EXPOSE 8089
ADD /target/MaisonHoteMicroservice-0.0.1-SNAPSHOT.jar MaisonHoteMicroservice.jar
ENTRYPOINT ["java" , "-jar" , "MaisonHoteMicroservice.jar"]