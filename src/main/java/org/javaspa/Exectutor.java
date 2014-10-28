package org.javaspa;


import org.javaspa.array.AllSubsets;
import org.javaspa.array.Stocks3;
import org.javaspa.numbersystem.PowerOf2;
import org.javaspa.numbersystem.SingleNumber2;
import org.javaspa.strings.EDIT;

/**
 * Created by Ankur Khurana on 5/9/14.
 */

public class Exectutor {
  public static void main(String args[]) {
    PowerOf2 p = new PowerOf2();
    System.out.println(p.isPowerOfTwo(12));
    System.out.println(p.isPowerOfTwo(16));
    System.out.println(p.isPowerOfTwo(8));
    System.out.println(p.isPowerOfTwo(64));
    System.out.println(p.isPowerOfTwo(65));
    Stocks3 s = new Stocks3();
    int [] a = {1,2,3,-5,2,5,8};
    System.out.println(s.maxProfit(a));
  }
}
