package loof

object LearnLoof {

  def main(args: Array[String]): Unit = {
    var (x, y, z, c, python, java) = (1, 2, 3, true, false, "no!")
    println(x, y, z, c, python, java)

    // while
    var i, sum = 0
    while (i < 10) {
      sum += i
      i += 1
    }
    println(sum)
    // for
    sum = 0
    for(i <- 0 until 10)
      sum += i
    println(sum)

    sum = (0 until 10).sum
    println(sum)

    // nested for
    for(a <- 1 to 3) {
      for(b <- 10 to 12)
        println(a, b)
    }
    println("same as")
    for(a <- 1 to 3; b <- 10 to 12)
      println(a, b)

  }

}
