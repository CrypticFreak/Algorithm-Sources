package com.cf

/**
 * Created by AnkurK on 1/14/15.
 */
object LifeUniverse {
  def main(args: Array[String]) {
    var continue = true
    while(continue){
      readLine() match {
        case "42" => continue = false
        case string: String => println(string)
      }
    }
  }
}
