package com.RishiScala

object Quiz {


  def area(radius : Double): Double = {
    val pi = 3.14
    pi  * radius * radius
  }
  def converter (temp : Double): Double = {
    (temp * 1.8000) + 32.00

  }
  def volume (radius :Double): Double = {
    val pi = 3.14
    radius * radius * radius * 4 * pi / 3
  }
  private def cost(copies : Int): Double =
  {
    val total1 = 24.95 * 0.6 * 60
    val additionalC = if (copies > 50) copies - 50 else 0
    val totalShipping = additionalC * 0.75 + (50 * 3)
    totalShipping + total1

  }
  def totalTime (): Double =
  {
    val esy = 8
    val temp = 7
    2 * esy * 2 + (3 * temp)
  }
  def main(args: Array[String]): Unit =
  {
    val Area = area(5)
    println(s"Area is $Area")
    val tempreature = converter(35.00)
    println(s"Tempreature in Farenhite is $tempreature")
    val vol = volume (5)
    println(s"Volume of a sphere with radius of 5 is $vol")
    val totalCost = cost(60)
    println(s"Total cost is $totalCost")
    val totalTimeTaken = totalTime()
    println(s"Total time taken in minutes is $totalTimeTaken")
  }
}
