FROM adoptopenjdk/openjdk8:alpine
COPY target/eureka-server.jar .
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "eureka-server.jar"]