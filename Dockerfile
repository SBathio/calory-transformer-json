# Use official Java 17 slim image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /

# Copy the Spring Boot fat JAR
COPY build/libs/*.jar app.jar

# Ensure port 8080 is exposed
EXPOSE 8080

# Launch the app
ENTRYPOINT ["java", "-jar", "app.jar"]