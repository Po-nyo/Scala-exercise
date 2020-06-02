package array

object Learn_Array {

  // 배열 출력 함수
  def printArray[K](array: Array[K]): Unit = println(array.mkString(", "))

  def main(args: Array[String]): Unit = {
    // 배열 출력
    val array1 = Array(1, 2, 3)
    print("Array 1 : ")
    printArray(array1)

    val array2 = Array("a", 2, true)
    print("Array 2 : ")
    printArray(array2)

    val itemAtIndex0 = array1(0)
    array1(0) = 4
    printArray(array1)

    // concat
    val concatenated = "앞에 붙이기" +: (array1 ++ array2) :+ "뒤에 붙이기"
    printArray(concatenated)

    // 값으로 index 찾기
    array2.indexOf("a")

    // 다른 값만 가져오기
    val diffArray = Array(1, 2, 3, 4).diff(Array(2, 3))
    printArray(diffArray)

    val personArray = Array(("솔라",1), ("문별",2), ("휘인",3))
    // Find 메소드를 이용해서 findByName이라는 메소드 생성
    // Find는 조건에 맞는 값을 찾으면 검색을 중단
    // getOrElse는 일치하는 값이 없을 경우 넘겨줄 기본 값
    // getOrElse가 없을때 일치하는 값이 없으면 None
    def findByName(name:String) = personArray.find(_._1 == name).getOrElse(("화사",4))
    val findSolar = findByName("솔라")  // 값("솔라",1)을 찾아서 넘겨줌
    val findSun = findByName("태양")  // 값이 없으므로 getOrElse에 있는 값("화사",4)이 들어감
    println(findSolar)
    println(findSun)

  }

}
