package timer

object Timer {

  def main(args: Array[String]): Unit = {
    oncePerSecond(timeFlies)
  }

  def oncePerSecond(callback: () => Unit): Unit = {
    for( i <- 0 until 10) {
      callback()
      Thread.sleep(1000)
    }
  }

  def timeFlies(): Unit = {
    println("time flies like an arrow...")
  }
}
