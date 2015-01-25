package com.hr

/**
 * Created by Ankur K on 1/14/15.
 */
object UtopianTree {
  def main(args: Array[String]) {
    val numTest = readInt()
    (1 to numTest).foreach(p => {
      val cycles = readInt()
      var height = 1
      (1 to cycles).foreach(p => {
        if(p%2 == 1) {
          height *= 2
        }
        else {
          height = height + 1
        }
      }

      )
      println(height)
    })
  }
}
