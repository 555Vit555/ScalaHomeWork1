package org.example

object App {
  

  
  def main(args : Array[String]) {
    //            Задание 3A
    val first_str = "Hello, Scala!"
    println(first_str)
    val low_str = first_str.map(_.toLower)
    println(low_str)
    val remove_str = first_str.replace("!", "")
    println(remove_str)
    val second_str = (" and goodbye python!")
    val result = remove_str + second_str
    println(result)
    //            Задание 3b
    //import scala.io.StdIn.readLine
    //println("Годовой доход:")
    //val year_salary = readLine().toInt
    //println("Премия:")
    //val bonus = readLine().toFloat
    //println("Компенсанция обеда:")
    //val lunch = readLine().toInt
    //val result_salary = (year_salary * bonus + lunch) * 0.87
    //print(s"Годовой доход: $result_salary")
    //            Задание 3c
    val firstList = List(100, 150, 200, 80, 120, 75)
    val commonSalary = firstList.sum
    val countPerson = firstList.size
    val midSalary = commonSalary / countPerson
        var i = 0
    var printRez = 0
    //while (i < countPerson) {
      //printRez = 100 - (firstList(i) * 100 / midSalary)
      //println(s"отклонение от средней з.п. = $printRez %")
      //i = i + 1

    //}
    //                  Задание 3d
    val secondList = firstList :+ 150
    //val maxSalary = secondList.max
    //val minSalary = secondList.min
    //println(s"Максимальная з.п.:$maxSalary")
    //println(s"Минимальная з.п.: $minSalary")
    //                  Задание 3e
    //val thirdList = secondList :+ 350 :+ 90
    //    println(thirdList.sorted)
    //                  Задание 3f
  }
}
