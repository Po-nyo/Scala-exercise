package function_exercise

object Learn_Function {

  def main(args: Array[String]): Unit = {
    println(s"${add(1, 2)}")
    println(s"${addWithoutBlock(3, 4)}")
  }

  def add(x: Int, y: Int): Int = {
    return x + y
  }

  def addWithoutBlock(x: Int, y: Int): Int = x + y

}
