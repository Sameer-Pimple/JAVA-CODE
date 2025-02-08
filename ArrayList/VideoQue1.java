/**
 * Que1
 */
import java.util.ArrayList;
import java.util.Collections;

public class VideoQue1 {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
    
        // Syntax of ArrayList

        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> lisr3 = new ArrayList<>();

        //adding elements in Arraylist there are differant functions (Add,Get,set,remove,contains,)

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(8);
        list.add(9);
        list.add(4);
        list.add(5);

        // Finding the size of an arraylist

        // System.out.println("size of ArrayList = " + list.size());
        // System.out.println(list);


        // for (int i = list.size() - 1; i >= 0; i--) {
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();

        //Sorting in Arraylist

        // Collections.sort(list);
        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list);

        //Adding ArrayList's inside the ArrayList

        ArrayList<ArrayList<Integer>> MainList = new ArrayList<>();
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(15);
        list2.add(16);
        MainList.add(list);
        MainList.add(list2);
        
        System.out.println(MainList);

    }
    
}