FROM eclipse-temurin:17-jre

WORKDIR /app

COPY build/hello-world-app.jar app.jar

ENTRYPOINT ["sh", "-c", "java -jar /app/app.jar \"$@\"; sleep ${SLEEP_SECONDS:-60}", "--"]
