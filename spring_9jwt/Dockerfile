# COPY build/libs/*.jar spring_9jwt.jar
# ---- Build Stage ----
FROM gradle:8.5-jdk21 AS builder
WORKDIR /app
COPY build.gradle settings.gradle ./
COPY gradlew . 
COPY gradle ./gradle
COPY src ./src
RUN ./gradlew build -x test --no-daemon

# ---- Run Stage ----
FROM amazoncorretto:21
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar  spring_9jwt.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", " spring_9jwt.jar"]
