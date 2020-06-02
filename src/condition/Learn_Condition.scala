package condition

object Learn_Condition {
  def main(args: Array[String]): Unit = {
    val likeEggs = false

    val breakfast =
      if(likeEggs) "계란 후라이"
      else "사과"

    println(s"아침으로 ${breakfast}를 먹었다")
  }
}
