FROM gradle:7.3-jdk11-alpine
COPY ./ ./
RUN gradle clean build
CMD ["java", "-jar", "build/libs/tr_task-0.0.1-SNAPSHOT.jar"]