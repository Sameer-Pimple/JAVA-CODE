import java.util.*;
// import java.util.Arrays; for Array.sort
// import java.util.Collections; for Arrays.sort(arr, Collections.reverseOrder())

public class ArraySorting2 {
    public static void printarr(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Integer arr[]={5,2,6,4,1,3};
        // Arrays.sort(arr);
        // Arrays.sort(arr,0,4);

        Arrays.sort(arr,Collections.reverseOrder()); /*for this func int to Integer*/
        Arrays.sort(arr,0,6,Collections.reverseOrder());
        printarr(arr);
      
    }
}