## To run docker-compose:
```
$ docker-compose build
$ docker-compose run scala sbt compile
$ docker-compose run scala sbt run
$ docker-compose run scala sbt test
```

## To send test kafka message:
```
$ docker-compose exec kafka bash
$ cd opt/kafka/bin
$ kafka-console-producer.sh  --broker-list kafka://kafka:9092 --topic foobar
```
