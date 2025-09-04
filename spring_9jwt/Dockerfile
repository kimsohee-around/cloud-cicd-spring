# COPY build/libs/*.jar spring_9jwt.jar
# ---- Build Stage ----
FROM gradle:8.3-jdk17 AS builder
WORKDIR /app
COPY build.gradle settings.gradle ./
COPY gradle ./gradle
COPY src ./src
RUN gradle build -x test --no-daemon

# ---- Run Stage ----
FROM openjdk:21-jdk
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar  spring_9jwt.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", " spring_9jwt.jar"]
