FROM openjdk:17-alpine

ADD ./target/notice-management-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/notice-management-service.jar"]

EXPOSE 6001