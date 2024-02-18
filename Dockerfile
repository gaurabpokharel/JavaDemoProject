# Use a base image with Java pre-installed
FROM adoptopenjdk:11-jre-hotspot

# Set the working directory in the container
WORKDIR /app

# Copy the packaged jar file into the container
COPY target/*.jar app.jar

# Specify the command to run the jar file
CMD ["java", "-jar", "app.jar"]