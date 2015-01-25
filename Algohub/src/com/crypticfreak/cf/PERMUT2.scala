package com.cf

object PERMUT2 {
  def main(args: Array[String]) {
    var continue = true

    while (readInt() != 0) {

      val permutation = readLine().split(" ").map(_.toInt)
      permutation.zipWithIndex.map(p => {
        p._2 + 1 == permutation(p._1 - 1)
      }).foldLeft(true)(_ && _) match {
        case true => println("ambiguous")
        case false => println("not ambiguous")
      }
    }
  }
}
