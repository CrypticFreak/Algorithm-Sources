package com.MathLib

import java.io.InputStream

class Scan(in: InputStream) {
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
}