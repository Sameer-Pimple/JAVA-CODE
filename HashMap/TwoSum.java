package HashMap;
import java.util.*;//learming Map.get()...return the value(Index)...we have to store the arr[i] as key

/*
Given an array of integer arr\[] and an integer target, return indices of the two numbr such that they add up to target
you may assume that each input whould have exactly one solution and you may not use the same element twice.

 */
public class TwoSum {
    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // value -> index

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(arr[i], i);
        }

        // If no solution found (not expected per the problem)
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int target = 9;

        int[] result = twoSum(arr, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
