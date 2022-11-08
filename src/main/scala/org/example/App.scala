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
    import scala.io.StdIn.readLine
    println("Годовой доход:")
    val year_salary = readLine().toInt
    println("Премия:")
    val bonus = readLine().toFloat
    println("Компенсанция обеда:")
    val lunch = readLine().toInt
    val result_salary = (year_salary * bonus + lunch) * 0.87
    println(s"Годовой доход: $result_salary")
    //            Задание 3c
    val firstList = List(100, 150, 200, 80, 120, 75)
    val commonSalary = firstList.sum
    val countPerson = firstList.size
    val midSalary = commonSalary / countPerson
        var i = 0
    var printRez = 0
    while (i < countPerson) {
      printRez = 100 - (firstList(i) * 100 / midSalary)
      println(s"отклонение от средней з.п. = $printRez %")
      i = i + 1



    }
    //                  Задание 3d
    val secondList1 = firstList.dropRight(1)
    val secondList = secondList1 :+ 125
    println(secondList)
    val maxSalary = secondList.max
    val minSalary = secondList.min
    println(s"Максимальная з.п.:$maxSalary")
    println(s"Минимальная з.п.: $minSalary")
    //                  Задание 3e
    val thirdList = (secondList :+ 350 :+ 90).sorted
    println(s"Отсортированный список:$thirdList")
    //                  Задание 3f
    val fourthList = (thirdList :+ 130).sorted
    val Index = (fourthList indexOf 130) + 1
    println(s"Новый сотрудник в списке:$Index")
    //                  Задание 3g


    val countFour = fourthList.size
    println("Минимальная з.п. для middle:")
    val minmidsalary = readLine().toInt
    println("Максимальная з.п. для middle:")
    val maxmidsalary = readLine().toInt

    var j = 0
    var printIndex = 0
    while (j < countFour) {
      if (minmidsalary < fourthList(j) && fourthList(j) < maxmidsalary)
      {
        var rend1 = fourthList(j)
        var rend  =  fourthList indexOf rend1
        println(s"Номер сотрудника middle $rend")
        j = j + 1}
      else {j = j + 1}
    }
    //                              Задание 3h
    import scala.math._


    var InndexList = fourthList.map(_ * 1.07)
    println(s"Индексированная з.п. сотрудников: $InndexList ")


  }
}
