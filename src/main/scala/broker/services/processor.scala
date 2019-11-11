package broker.services

import scala.util.parsing.json.JSON
import logging.Logger
import errors.ParseError

class Processor(topic: String, jsonMessage: String) extends App {
  def call: Unit = {
    try {
      val message = parsedMessage
    } catch {
      case e: ParseError => Logger.warn(e.getMessage)
    }
  }

  def parsedMessage: Map[String, Any] = {
    val result = JSON.parseFull(jsonMessage)
    result match {
      case Some(map: Map[String, Any]) => map
      case None => throw new ParseError(s"Parsing failed, original message: $jsonMessage")
      case other => throw new ParseError(s"Unknown data structure, original message: $jsonMessage")
    }
  }
}

