package list

object Learn_List {

  def main(args: Array[String]): Unit = {
    val list = List("a", 1, true)

    val firstItem = list(0)
    println(firstItem)

    // 앞에 붙이기는 :: 또는 +: 연산자
    // 리스트 두개를 붙이기는 ++ 또는 :::연산자
    // 뒤에 붙이기는 :+연산자(immutable list에서 효율적인 방법이 아님)
    val concatenated = 0 :: list ++ (list :+ 1000)
    println(concatenated)

    // Diff
    val diffList = List(1,2,3,4) diff List(2,3)
    println(diffList)

    //④ 배열의 Find와 같은 방식으로 동작
    val personList = List(("솔라",1), ("문별",2), ("휘인",3))
    def findByName(name:String) = personList.find(_._1 == name).getOrElse(("화사",4))
    val findSolar = findByName("솔라")  //값("솔라",1)을 찾아서 넘겨줌
    val findSun = findByName("태양")  //값이 없으므로 getOrElse에 있는 값("화사",4)이 들어감

    println(findSolar, findSun)
  }


}
