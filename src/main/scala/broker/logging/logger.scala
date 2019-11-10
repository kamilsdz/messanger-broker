package logging

object Logger {
  def info(message: String):  Unit = {
    printMsg("INFO", message)
  }

  def warn(message: String): Unit = {
    printMsg("WARN", message)
  }

  private def printMsg(prefix: String, message: String): Unit = {
    println("%s: %s".format(prefix, message))
  }
}
