package scala.basic.program

object d_GCD_Program {

  def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
    }
    b
  }
  def main(args: Array[String]): Unit = {
    val res = gcdLoop(3, 3)
    println(res)
  }

}