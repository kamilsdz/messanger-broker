package config

import java.util.Arrays
import cakesolutions.kafka.KafkaConsumer.Conf
import org.apache.kafka.common.serialization.{StringDeserializer}

object KafkaConf {
  val topics = Arrays.asList("messages")
  val bootstrapServers = System.getenv("KAFKA_HOST")
  val groupId = System.getenv("KAFKA_GROUP_ID")
  val enableAutoCommit = true
  val autoCommitInterval = 1000
  val sessionTimeoutMs = 30000
  val maxPartitionFetchBytes = 262144
  val consumerPollSize = 100

  def config: Conf[String,String] = {
    Conf(
      new StringDeserializer(),
      new StringDeserializer(),
      bootstrapServers = bootstrapServers,
      groupId = groupId,
      enableAutoCommit = enableAutoCommit,
      autoCommitInterval = autoCommitInterval,
      sessionTimeoutMs = sessionTimeoutMs,
      maxPartitionFetchBytes = maxPartitionFetchBytes,
     )
  }
}
