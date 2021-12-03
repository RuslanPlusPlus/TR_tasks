FROM openjdk:15-jdk-alpine
COPY ./ ./
RUN chmod a+x gradlew
RUN ./gradlew build
CMD ["java", "-jar", "build/libs/tr_task-0.0.1-SNAPSHOT.jar"]