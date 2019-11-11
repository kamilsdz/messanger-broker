package broker.services

import scala.collection.JavaConversions._
import logging.Logger
import config.KafkaConf
import cakesolutions.kafka.KafkaConsumer

class Broker extends App {
  def consume: Unit = {
    Logger.info("Starting consumer..")
    val consumer = KafkaConsumer(KafkaConf.config)
    consumer.subscribe(KafkaConf.topics);
    while (true) {
      val records = consumer.poll(KafkaConf.consumerPollSize);
      for (record <- records.iterator()) {
        new Processor(record.key, record.value).call
      }
    }
  }
}
