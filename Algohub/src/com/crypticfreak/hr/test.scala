package com.hr

/**
 * Created by Ankur on 1/14/15.
 */

object FlipBits
{

  def main(args: Array[String]) {
    io.Source.stdin.getLines().foreach(p => {
      println((Int.MaxValue<<1 ^ p.toInt))
    })
  }
}