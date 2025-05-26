package HashSet;
//Union & Intersection of 2 Arrays...
import java.util.*;

public class Lque2 {
    public static void Union(int arr1[], int arr2[]) {//Uniqe value
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set1.add(arr2[i]);
        }
        System.out.println("Union "+set1.size());
    }

    public static void Intersection(int arr1[], int arr2[]) { //same elements
        HashSet<Integer> set1 = new HashSet<>();
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (set1.contains(arr2[i])) {
                count++;
                set1.remove(arr2[i]);
            }
        }
        System.out.println("Intersection "+count);  
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9};
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        Union(arr1, arr2);
        Intersection(arr1,arr2);
    }
}