FROM openjdk:17-alpine

ADD ./target/config-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/config-service.jar"]

EXPOSE 8888