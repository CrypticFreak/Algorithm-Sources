package com.hr

object MaximizingXor {


  def maxXor(l: Int, r: Int): Int = {
    var maxXor = 0
    (l to r).foreach(p => {
      (l to r).foreach(q => maxXor = maxXor.max(p ^ q))
    })
    maxXor
  }

  def main(args: Array[String]) {
    var _l: Int = Console.readInt


    var _r: Int = Console.readInt


    val res = maxXor(_l, _r)
    println(res)
  }
}

