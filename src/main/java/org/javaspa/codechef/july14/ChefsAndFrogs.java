package org.javaspa.codechef.july14;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Ankur K on 7/6/14.
 */
class CordinatesRep {
  int index;
  int cordinate;
  int group;

  public CordinatesRep() {

  }
  public CordinatesRep(int cordinate) {
    this.index  = index;

  }
  @Override
  public String toString() {
    return index + " " + cordinate + " " + group;
  }
}

class ChefsAndFrogs {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numFrogs = sc.nextInt();
    int maxDist = sc.nextInt();
    int pairFrogs = sc.nextInt();
    CordinatesRep[] frogSet = new CordinatesRep[numFrogs];
    int currentSet = 0;
    for (int i = 0; i < numFrogs; i++) {
      frogSet[i] = new CordinatesRep();
      frogSet[i].index = i + 1;
      frogSet[i].cordinate = sc.nextInt();
    }

    Arrays.sort(frogSet, new Comparator<CordinatesRep>() {
      @Override
      public int compare(CordinatesRep cordinatesRep, CordinatesRep cordinatesRep2) {
        return cordinatesRep.cordinate - cordinatesRep2.cordinate;
      }
    });

    frogSet[0].group = currentSet;
    for (int i = 1; i < numFrogs; i++) {
      if (frogSet[i].cordinate - frogSet[i - 1].cordinate > maxDist) {
        currentSet++;
      }
      frogSet[i].group = currentSet;
    }

    Arrays.sort(frogSet, new Comparator<CordinatesRep>() {
      @Override
      public int compare(CordinatesRep cordinatesRep, CordinatesRep cordinatesRep2) {
        return cordinatesRep.index - cordinatesRep2.index;
      }
    });

    while (pairFrogs > 0) {
      int frog1 = sc.nextInt();
      int frog2 = sc.nextInt();

      if(frogSet[frog1-1].group == frogSet[frog2-1].group)
        System.out.println("Yes");
      else System.out.println("No");
      pairFrogs--;
    }
  }
}
