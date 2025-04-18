package Heap;

public class HeapSort {
    private static void Heapify(int arr[],int i, int n) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int MaxIdx = i;

        if (left < n && arr[MaxIdx] < arr[left] ) {
            MaxIdx = left;
        }
        if (right < n && arr[MaxIdx] < arr[right]) {
            MaxIdx = right;
        }
        if (MaxIdx != i) {
            //swap
            int temp = arr[i];
            arr[i] = arr[MaxIdx];
            arr[MaxIdx] = temp;

            Heapify(arr,MaxIdx, i);
        }     
    }
    public static void heapsort(int arr[]) {
        int n = arr.length;
        // step 1 convert into Maxheap
        for (int i = n / 2; i >= 0; i--) {// O(n*logn)
            Heapify(arr,i,n);
        }
        // step 2 swap first and last
        for (int i = n - 1; i > 0; i--) { //O(n*logn)
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // step 3 Correct The Heap(Heapify)
            Heapify(arr, 0, i);
        }


    }


    public static void main(String args[]) {
        int arr[] = {1,2,4,5,3};
        heapsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}
