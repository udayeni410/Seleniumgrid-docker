FROM maven:3.5-jdk-8-alpine
WORKDIR /docker
COPY . .
CMD mvn clean install