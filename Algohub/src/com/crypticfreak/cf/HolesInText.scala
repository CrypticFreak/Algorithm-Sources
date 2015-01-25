package com.cf

import java.io.{InputStreamReader, BufferedReader}

object HolesInText {
  def getHoleMap = {
    var map = Map[Char, Int]()
    map = map.updated('A', 1)
    map = map.updated('B', 2)
    map = map.updated('C', 0)
    map = map.updated('D', 1)
    map = map.updated('E', 0)
    map = map.updated('F', 0)
    map = map.updated('G', 0)
    map = map.updated('H', 0)
    map = map.updated('I', 0)
    map = map.updated('J', 0)
    map = map.updated('K', 0)
    map = map.updated('L', 0)
    map = map.updated('M', 0)
    map = map.updated('N', 0)
    map = map.updated('O', 1)
    map = map.updated('P', 1)
    map = map.updated('Q', 1)
    map = map.updated('R', 1)
    map = map.updated('S', 0)
    map = map.updated('T', 0)
    map = map.updated('U', 0)
    map = map.updated('V', 0)
    map = map.updated('X', 0)
    map = map.updated('Y', 0)
    map = map.updated('Z', 0)
    map
  }

  def main(args: Array[String]) {

    val br = new BufferedReader(new InputStreamReader(System.in))
    val testCases = br.readLine().toInt
    val holesMap = getHoleMap
    (1 to testCases).foreach(p => {
      println(br.readLine().toCharArray.map(p => holesMap.getOrElse(p, 0)).sum)
    })
  }
}
