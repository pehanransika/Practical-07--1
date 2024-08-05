object EvenNumbersFilter {

  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(num => num % 2 == 0)
  }
    def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = filterEvenNumbers(numbers)
    println(s"Input: $numbers")
    println(s"Output: $evenNumbers")
  }

}
