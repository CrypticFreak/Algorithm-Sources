package com.cf

object CupCakes1 {
  def main(args: Array[String]) {
    val testCases = readInt()
    (1 to testCases).foreach(p => {
      println((readInt()/2)+1)
    })
  }
}
