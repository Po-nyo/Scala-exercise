package mutable_collection

import scala.collection.mutable

object Learn_Mutable {

  def main(args: Array[String]): Unit = {
    // ① 배열로 구현되는 ArrayBuffer
    val arrayBuffer = mutable.ArrayBuffer(1, 2, 3)
    arrayBuffer += 4
    arrayBuffer -= 1
    arrayBuffer ++= List(5, 6, 7)
    println(s"① $arrayBuffer")

    // ② Linked list로 구현되는 ListBuffer
    val listBuffer = mutable.ListBuffer("a", "b", "c")
    println(s"② $listBuffer")

    // ③ Mutable Set
    val hashSet = mutable.Set(0.1, 0.2, 0.3)
    hashSet ++= mutable.Set(5)
    println(s"③ $hashSet")

    // ④ Mutable Map
    val hashMap = mutable.Map("one" -> 1, "two" -> 2)
    hashMap ++= Map("five" -> 5, "six" -> 6)
    println(s"④ $hashMap")

  }

}
