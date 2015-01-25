package com.hr

/**
 * Created by Ankur on 1/14/15.
 */
object LonelyInteger {
  def main(args: Array[String]) {
    val numInt = readInt()
    println(readLine().split(" ").map(_.toInt).foldLeft(0)(_ ^ _))
  }
}
