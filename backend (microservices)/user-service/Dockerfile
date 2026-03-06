FROM eclipse-temurin:17-jre

WORKDIR /app

# curl is required by docker-compose healthchecks.
RUN apt-get update && apt-get install -y --no-install-recommends curl \
    && rm -rf /var/lib/apt/lists/*

COPY target/*.jar app.jar

EXPOSE 5001

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
