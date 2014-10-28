package org.javaspa.strings;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by annkur on 7/16/14.
 */
public class Paranthesis {
  ArrayList<String> result;
  public List<String> generateParenthesis(int n) {
    result = new ArrayList<String>();
    fillResults("", n, 0, 0);
    return result;
  }

  private void fillResults(String s, int total, int open, int close){
    if(s.length() == 2 * total){
      result.add(s);return;
    }
    if(open < total){
      fillResults(s + "(", total, open + 1, close);
    }
    if(open > close){
      fillResults(s + ")", total, open, close + 1);
    }
  }
}
