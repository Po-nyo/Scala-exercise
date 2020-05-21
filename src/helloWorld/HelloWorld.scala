package helloWorld

object HelloWorld {
    def main(args: Array[String]): Unit = {
      println("Hello World!!")
      /*
      *  var = 변수
      *  val = 상수
      */
      var x = 10
      var y = 4

      /* 다음과 같이 변수와 수식 사용가능 */
      println(s"$x + $y = ${x + y}")

      /* to, until 을 사용하여 range(범위) 생성 가능 */
      val range1 = 1 to 10
      println(s"\n1 to 10 --> $range1")
      for(i <- range1)
        print(s"$i ")


      val range2 = 1 until 10
      println(s"\n\n1 until 10 --> $range2")
      for(i <- range2)
        print(s"$i ")

      val range3 = 1 until 10 by 3
      println(s"\n\n1 until 10 by 3 --> $range3")
      for(i <- range3)
        print(s"$i ")

      println(s"\n\nrange1.toList --> ${range1.toList}")

      val moreThan4 = range1.filter(_ > 4)
      println(s"\nrange1.filter(_ > 4) --> $moreThan4")

      val doubleItem = range1.map(_ * 2)
      println(s"\nrange1.map(_ * 2) --> $doubleItem")

      val num = -5
      val numAbs = num.abs // 절대값
      val max5or7 = numAbs.max(7) // 5(numAbs)와 7 사이의 최대값
      val min5or7 = numAbs.min(7) // 5(numAbs)와 7 사이의 최소값
      println(numAbs) // 5
      println(max5or7) // 7
      println(min5or7) // 5

      // 뒤집기
      val reverse = "Scala".reverse
      println(s"$reverse")

      // 첫글자를 대문자로
      val cap = "scala".capitalize
      println(s"$cap")

      // 7번 반복
      val multi = "Scala! " * 7
      println(s"$multi")

      // 정수로 변환
      val int = "123".toInt
      println(s"$int")
    }
}
