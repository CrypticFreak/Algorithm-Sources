package com.crypticfreak;
import javacodes.geometry.MaxLines;
import javacodes.geometry.Point;


/**
 * Created by Ankur Khurana on 5/9/14.
 */

public class Exectutor {
  public static void main(String args[]) {
      MaxLines rev = new MaxLines();
      Point[] points = {new Point(0,0), new Point(-1, -1), new Point(2, 2)};
      System.out.println(rev.maxPoints(points));
  }
}
