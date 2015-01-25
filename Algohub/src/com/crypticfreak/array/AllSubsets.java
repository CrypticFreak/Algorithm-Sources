package javacodes.array;

import java.util.*;

/**
 * Created by Ankur K on 7/21/14.
 */
public class AllSubsets {
  public List<List<Integer>> subsets(int[] S) {
    int len = S.length;
    HashSet<List<Integer>> result = new HashSet<List<Integer>>();
    Arrays.sort(S);
    int totalSubsets = (int)Math.pow(2, len);
    int p = 1&2;
    for(int i = 0; i<totalSubsets; i++)
    {
      List<Integer> l = new ArrayList<Integer>();
      for(int j=0;j<len;j++){
        if((1<<j&i) == 0){
          l.add(S[j]);
        }
      }
      result.add(l);
    }
    ArrayList<List<Integer>> fresult = new ArrayList<List<Integer>>();
    fresult.addAll(result);
    return fresult;
  }
}