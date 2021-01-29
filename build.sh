#!/bin/sh

docker container rm -f provider-service
docker image rm -f pantha/provider-service:v1

./gradlew build 

cp ./build/libs/*.jar ./build/libs/app.jar
# java -jar ./build/libs/app.jar 

docker build --build-arg JAR_FILE=build/libs/app.jar -t pantha/provider-service:v1 .
#docker run  --name provider-service -d -p 50001:50001 pantha/provider-service:v1
