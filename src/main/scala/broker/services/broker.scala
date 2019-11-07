package broker.services

import cakesolutions.kafka.KafkaConsumer
import cakesolutions.kafka.KafkaConsumer.Conf
import org.apache.kafka.common.serialization.{StringDeserializer}

class Broker extends App {
  def consume: Unit = {
    println("Starting consumer..")
    KafkaConsumer(config)
  }

  def config: Conf[String,String] = {
    Conf(
      new StringDeserializer(),
      new StringDeserializer(),
      bootstrapServers = System.getenv("KAFKA_HOST"),
      groupId = System.getenv("KAFKA_GROUP_ID"),
      enableAutoCommit = true,
      autoCommitInterval = 1000,
      sessionTimeoutMs = 30000,
      maxPartitionFetchBytes = 262144,
     )
  }
}
