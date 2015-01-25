package com.cf

/**
 * Created by Ankur on 1/14/15.
 */
//object ATM{
object ATM {
  def main(args: Array[String]) {
    val transactionCharge = 0.5
    val consoleLineReader = io.Source.stdin.getLines().toIterator
    while(consoleLineReader.hasNext){
      val variables = consoleLineReader.next().split(" ").map(_.toFloat)
      val (withdraw, totalBalance) = (variables(0), variables(1))
      if(withdraw + transactionCharge <= totalBalance && withdraw%5 == 0){
        println("%.2f".format(totalBalance - (withdraw + transactionCharge)))
      }
      else {
        println("%.2f".format(totalBalance))
      }
    }
  }
}
