package javacodes.codechef.july14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by Ankur K on 7/6/14.
 */
class Chef{
  int score;
  int owner;
  int maxScore;
}
class DishOwner {
  static public void main(String []args) throws IOException{
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int numTests = Integer.parseInt(bufferedReader.readLine());
    //Scanner sc = new Scanner(System.in);
    //int numTests = sc.nextInt();
    StringBuilder buff = new StringBuilder();
    while(numTests > 0){
      int numChef = Integer.parseInt(bufferedReader.readLine());
      Chef[] chefs = new Chef[numChef];
      StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
      for(int i=0;i<numChef;i++){
        chefs[i] = new Chef();
        chefs[i].owner = i;
        chefs[i].score = Integer.parseInt(st.nextToken());
        chefs[i].maxScore = chefs[i].score;
      }
      int numQueries = Integer.parseInt(bufferedReader.readLine());
      while(numQueries > 0){
        StringTokenizer st2 = new StringTokenizer(bufferedReader.readLine());
        int op = Integer.parseInt(st2.nextToken());
        if(op == 0){
          int chef1 = Integer.parseInt(st2.nextToken()) - 1;
          int chef2 = Integer.parseInt(st2.nextToken()) - 1;
          if(chefs[chef1].owner == chefs[chef2].owner){
            buff.append("Invalid query!");
            buff.append('\n');
          } else if(chefs[chef1].maxScore - chefs[chef2].maxScore > 0){
            chefs[chef2].maxScore = chefs[chef1].maxScore;
            chefs[chef2].owner = chefs[chef1].owner;
          } else if(chefs[chef2].maxScore - chefs[chef1].maxScore > 0){
            chefs[chef1].maxScore = chefs[chef2].maxScore;
            chefs[chef1].owner = chefs[chef2].owner;
          }
        }
        else {
          int index = Integer.parseInt(st2.nextToken()) - 1;
          //System.out.println(chefs[index].owner + 1);
          buff.append(chefs[index].owner + 1);
          buff.append('\n');
        }
        numQueries--;
      }
      numTests--;
    }
    System.out.println(buff.toString());
  }
}
