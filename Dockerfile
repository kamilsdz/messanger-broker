FROM mozilla/sbt

RUN mkdir -p /broker
RUN mkdir -p /broker/out

WORKDIR /broker

COPY . /broker
