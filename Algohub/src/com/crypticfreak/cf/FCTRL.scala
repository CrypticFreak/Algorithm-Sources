package com.cf

object FCTRL {
  def main(args: Array[String]) {
    val numTestCases = readInt()
    (1 to numTestCases).foreach(p => {
      var num = readInt()
      var numZeroes = 0
      val dividingFactor = 5
      while (num > 0) {
        numZeroes += num / dividingFactor
        num = num / dividingFactor
      }
      println(numZeroes)
    })
  }
}
