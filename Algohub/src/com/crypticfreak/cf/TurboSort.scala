package com.cf

import java.io.{PrintWriter, InputStream, InputStreamReader, BufferedReader}

object TurboSort {
  /*
  def main(args: Array[String]) {
    val br = new Scan2(new InputStreamReader(System.in))
    val testCases = br.nextInt()
    var out = new PrintWriter(System.out)

    val sortingArray = new Array[Int](1000001)
    (1 to testCases).foreach(p => {
      val num = br.nextInt()
      sortingArray(num) = sortingArray(num) + 1
    })

    sortingArray.zipWithIndex.foreach(p =>{
      if(p._1 > 0)
      (1 to p._1).foreach(q => out.println(p._2))
    })
    out.close()
  }

  private class Scan2(in: InputStream) {
    var pos: Int = 0
    var count: Int = 0
    var buf: Array[Byte] = new Array[Byte](1 << 16)
    private def read(): Byte = {
      if (pos == count) {
        try {
          pos = 0
          count = in.read(buf, pos, buf.length)
          if (count == -1) {
            buf(0) = -1
          }
        } catch {
          case e: Exception => ;
        }
      }
      var b = buf(pos)
      pos += 1
      return b
    }
    def nextLong(): Long = {
      var c = read
      var sign = 1
      while (c <= ' ') {
        c = read
      }
      if (c == '-') {
        sign = -1
        c = read
      }
      var n: Long = 0L
      do {
        n = n * 10 + c - '0'
        c = read
      } while (c >= '0')
      return n * sign
    }
    def nextInt(): Int = {
      return nextLong.toInt
    }
    def nextDouble(): Double = {
      return next.toDouble
    }
    def nextChar(): Char = {
      var c = read
      while (c <= ' ')
        c = read
      return c.toChar
    }
    def next(): String = {
      var sb = new StringBuilder()
      var c = read
      while (c <= ' ')
        c = read
      while (c > ' ') {
        sb.append(c.toChar)
        c = read
      }
      return sb.toString
    }
  }*/
}
