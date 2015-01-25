package com.cf

import scala.collection.immutable.Queue


object DIGJUMP {
/*
  private def charToInt(char: Char) = {
    char - '0'
  }

  private def intToJump(currentIndex: Int, length: Int) = {
    List((currentIndex + 1 + length) % length,(currentIndex - 1 + length) % length)
  }

  def main(args: Array[String]){
    val digits = readLine().toCharArray.map(charToInt(_)).zipWithIndex
    val digitMap: Array[List[Int]] = (1 to 10).map(p => {
      List[Int]()
    }).toArray

    val graph = new Array[Array[Int]](digits.length)

    // Construct Graph
    digits.foreach(p => {
      digitMap(p._1) = digitMap(p._2) :: p._2
    })

    digits.foreach(p => {
      graph(p._2) = intToJump(p._2, digits.length) ::: digitMap(p._2)
    })


    // Do bfs
    val q = Queue[(Int, Int)]()
    val digitVisited = new Array[(Int, Int)](10)

  }

*/
}
