FROM ygbgames/java-base:latest

COPY ./start.sh /code/
COPY target/app.jar /code/app.jar
RUN chmod -R 777 /code