package HashMap;

import java.util.*;

public class Lque1 {

    public static void MajorElement(int arr[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int time = arr.length / 3;
        
        for (int i = 0; i < arr.length; i++) {
            // if (hm.containsKey(arr[i])) {
            //     hm.put(arr[i], hm.get(arr[i]) + 1); //get function get only value not the key
            // } else {
            //     hm.put(arr[i], 1);
            // }
            //Insted of up 4lines we can used advance function
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        
        // Set<Integer> keys = hm.keySet(); //Insted of Storing the keys we can direct put funvtion in forloop
        // for (Integer key : keys) {
        for(Integer key : hm.keySet()){
            if (hm.get(key) > time) {
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        MajorElement(arr);
    }
}
  