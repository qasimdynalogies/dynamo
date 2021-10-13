FROM openjdk:8

ADD target/dynamo-0.0.1-SNAPSHOT.jar dynamo-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","dynamo-0.0.1-SNAPSHOT.jar"]