package org.javaspa.HackerEarth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SherlockXOR {
  public static void main(String args[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    int numTests = Integer.parseInt(line);
    for (int i = 0; i < numTests; i++) {
      int numInt = Integer.parseInt(br.readLine());
      StringTokenizer st = new StringTokenizer(br.readLine());
      int numEvens = 0;
      int numOdds = 0;
      int result = 0;
      for (int j = 0; j < numInt; j++) {
        int temp = Integer.parseInt(st.nextToken());
        if(temp%2 == 0){
          numEvens++;
          result+= numOdds;
        } else {
          numOdds++;
          result+=numEvens;
        }
      }
      System.out.println(result);
    }
  }
}

