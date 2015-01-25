package javacodes.codechef.july14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by Ankur K on 7/6/14.
 */
class factorizedInteger{
  long value;
  ArrayList<Integer> factors;
  ArrayList<Integer> powers;
  public factorizedInteger(int value){
    factors = new ArrayList<Integer>();
    powers = new ArrayList<Integer>();
    for(int i=2;i*i<=value;i++){
      int factor = 0;
      while(value%i == 0){
        factor++;
        value=value/2;
      }
      factors.add(i);
      powers.add(factor);
    }
  }
}
class GardenGame {
  private static  long gcd(long a, long b){
    if(a%b == 0) return b;
    else return gcd(b, a%b);
  }
  private static long lcmNum(long a, long b){
    long tempgcd = gcd(a,b);
    return (a/tempgcd)*b;
  }
  public static void main(String []args) throws IOException{
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int numTests = Integer.parseInt(bufferedReader.readLine());

    while(numTests > 0){
      int numBandits = Integer.parseInt(bufferedReader.readLine());
      StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
      int[] bandit = new int[numBandits+1];
      int[] banditMarked = new int[numBandits+1];
      ArrayList<Integer> lcm = new ArrayList<Integer>();
      for(int i=0; i<= numBandits; i++){
        banditMarked[i]=0;
      }

      for(int i=1; i<= numBandits; i++){
       bandit[i] = Integer.parseInt(st.nextToken());
      }

      for(int i=1;i<=numBandits;i++){
        if(banditMarked[i]!=0)continue;
        int total = 0;
        int next = i;
        do {
          banditMarked[next] = 1;
          total++;
          next = bandit[next];
        } while(banditMarked[next] == 0);
        lcm.add(total);
      }
      long answer = lcm.get(0);
      for(int i=1; i<lcm.size(); i++)
      {
        answer = lcmNum(answer, lcm.get(i));
      }
      answer = answer% 1000000007;
      System.out.println(answer);
      numTests--;
    }
  }
}
