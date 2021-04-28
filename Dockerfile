FROM gradle:6.3-jdk11

RUN mkdir /src
RUN mkdir /app

COPY . /src
WORKDIR /src

RUN gradle --no-daemon clean build bootJar -x test
RUN cp ./build/libs/factory14-api.jar /app

WORKDIR /app
CMD java -jar ./factory14-api.jar