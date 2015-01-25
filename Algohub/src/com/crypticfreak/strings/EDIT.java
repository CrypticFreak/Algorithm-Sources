package javacodes.strings;

/**
 * Created by AnkurK on 7/28/14.
 */
public class EDIT {
  int[][] mem;

  public int minDistance(String word1, String word2) {
    mem = new int[word1.length()+1][word2.length()+1];
    for(int i=0; i<=word1.length();i++){
      for(int j=0;j<=word2.length();j++){
        mem[i][j] = -1;
      }
    }

    return _minDistance(word1, word1.length(), word2, word2.length());
  }
  private int _minDistance(String word1, int index1, String word2, int index2) {
    if(index1==0) return index2;
    if(index2==0) return index1;
    if(mem[index1][index2] != -1) return mem[index1][index2];
    int cost = 0;
    if(word1.charAt(index1-1) != word2.charAt(index2-1)){
      cost = 1;
    }

    int ans = Math.min(_minDistance(word1, index1 - 1, word2, index2) + 1,
        Math.min(_minDistance(word1, index1, word2, index2 - 1) + 1,
        _minDistance(word1, index1 - 1, word2, index2 - 1) + cost));
    mem[index1][index2] = ans;
    return ans;
  }
}