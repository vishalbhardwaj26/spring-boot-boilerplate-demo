FROM openjdk:17-alpine

ADD ./target/gatewayservice.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/gatewayservice.jar"]

EXPOSE 4000