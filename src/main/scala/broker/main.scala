package broker

import broker.services.{Broker}

object Main extends App {
  val broker = new Broker
  broker.consume
}
