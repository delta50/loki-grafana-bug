FROM openjdk:13

WORKDIR /app

# Copy application
COPY demo/ ./

RUN ["./gradlew", "assemble"]
CMD ["java", "-jar", "build/libs/demo-0.0.1-SNAPSHOT.jar"]
