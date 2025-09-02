# Build stage: compile with Maven
FROM maven:3.8.4-openjdk-11 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn package

# Runtime stage: use slim JRE
FROM openjdk:11-jre-slim
WORKDIR /app
# Copy the built JAR and (if any) dependency libs
COPY --from=build /app/target/*.jar ./app.jar
# If you have a libs folder, copy it too (as in the example below)
# COPY --from=build /app/target/libs ./libs
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]