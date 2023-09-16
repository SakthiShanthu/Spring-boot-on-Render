FROM maven:3.8.3-openjdk-11 as build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:11-jdk-slim-sid
COPY --from=build /target/render-0.0.1.jar render.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "render.jar"]