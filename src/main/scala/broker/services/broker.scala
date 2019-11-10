package broker.services

import logging.Logger
import config.KafkaConf
import cakesolutions.kafka.KafkaConsumer

class Broker extends App {

  def consume: Unit = {
    Logger.info("Starting consumer..")
    val consumer = KafkaConsumer(KafkaConf.config)
    consumer.subscribe(KafkaConf.topics);
  }
}
