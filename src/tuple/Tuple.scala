package tuple

object Tuple {

  def main(args: Array[String]): Unit = {
    /* Tuple1 ~ Tuple22 */
    val t1 = Tuple3(1, "hello", true)
    val t2 = (1, "hello", true)

    println(t2)

    var numbers = (1, 2, 3, 4)
    val sum = numbers._1 + numbers._2 + numbers._3 + numbers._4
    println(sum)

    val (a, b) = swap("hello", "world")
    println(a, b)
  }

  def swap(x: Any, y: Any): (Any, Any) = (y, x)

}
