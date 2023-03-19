FROM openjdk:17-alpine

ADD ./target/user-management-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/user-management-service.jar"]

EXPOSE 5003