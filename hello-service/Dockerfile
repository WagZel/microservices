FROM openjdk:8
MAINTAINER Ivan Zelinov <wag6051@gmail.com>

ADD ./build/libs/hello-service-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/hello-service-0.0.1-SNAPSHOT.jar"]

EXPOSE 1002