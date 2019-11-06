package broker.services

import cakesolutions.kafka.KafkaConsumer
import cakesolutions.kafka.KafkaConsumer.Conf
import org.apache.kafka.common.serialization.{StringDeserializer}

class Broker extends App {
  def consume: Unit = {
    println("Hello")
     KafkaConsumer(
       Conf(
         new StringDeserializer(),
         new StringDeserializer(),
         bootstrapServers = "kafka:9092",
         groupId = "group",
         enableAutoCommit = true,
         autoCommitInterval = 1000,
         sessionTimeoutMs = 30000,
         maxPartitionFetchBytes = 262144,
       )
    )
  }
}
