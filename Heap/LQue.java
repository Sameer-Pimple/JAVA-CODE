package Heap;
import java.util.ArrayList;

//Taking About Min Heap. 
public class LQue {//Heapify is a function which is used Correcting Heap
    static class Heap { //Heap is Noting But a priority Queue...
        ArrayList<Integer> arr = new ArrayList<>();

        // Heap Function to Add Values.
        public void add(int data) {
            //add the value in last index
            arr.add(data);

            int x = arr.size() - 1; //child Index
            int par = (x - 1) / 2; // parent Index

            while (arr.get(x) < arr.get(par)) { //for MaxHeap add use >
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }
        //Heap function for peek
        public int peek() {
            return arr.get(0);
        }

        private void Heapify(int i) {// this Function is for MinHeap...
            int left = 2*i + 1;
            int right = 2 * i + 2;
            int mini = i;

            if (left<arr.size() && arr.get(mini) > arr.get(left)) {   //for MaxHeap use <
                mini = left;
            }
            if (right <arr.size() && arr.get(mini)>arr.get(right)) {   // for MaxHeap use <
                mini = right;

            }
            if (mini != i) {
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(mini));
                arr.set(mini, temp);
                
                Heapify(mini);
            }

        }

        //Heap Function to Delete Mini value....last value can easy to delete so swap and delete and correct heap(Heapify).
        public int remove() {
            int data = arr.get(0);

            //Step 1 Swap the 1st & last Node
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            //Step 2 remove Last Node
            arr.remove(arr.size() - 1);

            //Step 3 correct the Heap Using Heapify.
            Heapify(0);
            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String args[]) {
        Heap a = new Heap();
        a.add(3);
        a.add(4);
        a.add(1);
        a.add(5);

        while (!a.isEmpty()) {
            System.out.println(a.peek());
            a.remove();
        }
        
        
    }    
}