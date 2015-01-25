package com.cf

object INTEST {
  def main(args: Array[String]) {
    val numTestCases = readInt()
    val divisor = readInt()
    var divisibleIntegers = 0
    val consoleReaderIterator = io.Source.stdin.getLines().toIterator
    (1 to numTestCases).foreach( p => {
      if(readInt() % divisor == 0){
        divisibleIntegers = divisibleIntegers + 1
      }
    })
    println(divisibleIntegers)
  }
}
