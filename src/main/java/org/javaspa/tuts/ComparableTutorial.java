package org.javaspa.tuts;

/**
 * Created by Ankur K on 5/12/14.
 */
public class ComparableTutorial implements Comparable {
  private int n;

  public ComparableTutorial(int n){
    this.n = n;
  }

  /**
   * compareTO should always follow the following rules :
   * 1. It should be transitive, reflexive and symmetric.
   * 2. If compareTo returns 0 for some comparison, ideally equals should also return true for them
   * 3. All the Collections which are sorted uses this method to compare the elements
   * 4. If the objects are not comparable, should throw ClassCastException
   * 5. All the fields which needs to be compared should implement comparable. Else you can define your own Comparator for them.
   * @param o
   * @return
   */
  @Override
  public int compareTo(Object o) {
    if( this.n > ((ComparableTutorial)o).n){
      return 1;
    }
    if( this.n < ((ComparableTutorial)o).n){
      return 1;
    }
    return 0;
  }

  @Override
  public boolean equals(Object o) {
    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }
}
