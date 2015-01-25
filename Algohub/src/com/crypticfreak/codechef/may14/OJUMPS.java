package javacodes.codechef.may14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Ankur K on 5/12/14.
 * CodeChef : http://www.codechef.com/MAY14/status/OJUMPS
 * Accepted : No
 */
public class OJUMPS {
  public static void main(String []args){
    try{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      long chefPosition = Long.parseLong(br.readLine());
      long modResult = chefPosition%6;
      long currentStep = chefPosition%3;
      if(currentStep == 0 && chefPosition == 0)
      {
        System.out.println("yes");
        return;
      }
      if(currentStep == 1 && chefPosition == 1)
      {
        System.out.println("yes");
        return;
      }
      if(currentStep == 2 && chefPosition == 3)
      {
        System.out.println("yes");
        return;
      }
      System.out.println("no");
      return;
    }
    catch (Exception e){
      e.printStackTrace();
    }
  }
}
