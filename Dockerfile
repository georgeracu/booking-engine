FROM openjdk:17

VOLUME /tmp

COPY build/libs/*-all.jar app.jar
COPY config.yml config.yaml

ENTRYPOINT ["java","-jar","/app.jar","server","/config.yaml"]