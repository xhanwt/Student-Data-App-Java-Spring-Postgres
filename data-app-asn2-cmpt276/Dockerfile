FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/data-app-asn2-cmpt276-0.0.1-SNAPSHOT.jar data-app-asn2-cmpt276.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","data-app-asn2-cmpt276.jar"]