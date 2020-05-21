package function_exercise

object Learn_Function2 {

  def main(args: Array[String]): Unit = {
    val call_1 = doWithFunction((x: Int, y: Int) => x + y)
    val call_2 = doWithFunction((x, y) => x + y)
    val call_3 = doWithFunction(_ + _)

    println(s"$call_1 $call_2 $call_3")

    def add1(x:Int, y:Int) = x + y
    val add2 = (x:Int, y:Int) => x + y
    val add3:(Int,Int)=>Int = _ + _

    println(add1(10, 20))
    println(add2(20, 30))
    println(add3(30, 40))

  }

  def doWithFunction(f: (Int, Int) => Int): Int = {
    return f(1, 3)
  }
}
