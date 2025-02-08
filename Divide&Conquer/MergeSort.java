public class MergeSort {

    public static void Printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Mergesort(int arr[], int si, int ei) {

    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        Mergesort(arr, 0, arr.length - 1);
    }
    
}