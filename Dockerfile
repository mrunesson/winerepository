FROM openjdk:11-slim

COPY build/libs/wine-repository-1.0.0-all.jar /root/kotlin-server.jar

WORKDIR /root

CMD ["java", "-server", "-XX:+UseG1GC", "-XX:MaxGCPauseMillis=100", "-XX:+UseStringDeduplication", "-jar", "kotlin-server.jar"]
