import java.util.Collections;
import java.util.LinkedList;;

public class secondQuestion {

   public static void questionTwo(int[]firstList,int[]secondList,int[]thirdList){
    LinkedList<Integer> FirstList = new LinkedList<>();
    LinkedList<Integer> SecondList = new LinkedList<>();
    LinkedList<Integer> ThirdList = new LinkedList<>();
    LinkedList<Integer> MergedList = new LinkedList<>();

    for(int k = 0; k < firstList.length; k++){
        FirstList.add(k,firstList[k]);;
    }
    for(int n = 0; n < secondList.length; n++){
        SecondList.add(n,secondList[n]);;
    }
    for(int m = 0; m < thirdList.length; m++){
        ThirdList.add(m,thirdList[m]);;
    }

    MergedList.addAll(FirstList);
    MergedList.addAll(SecondList);
    MergedList.addAll(ThirdList);

    System.out.println("L1: "+ FirstList);
    System.out.println("L2: "+ SecondList);
    System.out.println("L3: "+ ThirdList);
    System.out.println("Merged: "+ MergedList);
    
    Collections.sort(MergedList);

    System.out.println("Merged and Sorted: "+ MergedList);
   }

    
}
