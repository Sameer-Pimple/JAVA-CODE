package Heap;

import java.util.PriorityQueue;

public class Que1 {
    public static void main(String[] args) {
        int[] stream = { 10, 20, 11, 70, 50, 40, 100};
        int k = 3;

        //make prority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            pq.add(stream[i]);
            if (pq.size() == k) {
                System.out.print(pq.peek()+" ");
            } else {
                System.out.print("_ ");
            }
        }
        for (int i = k; i < stream.length; i++) {
            pq.remove();
            pq.add(stream[i]);
            if (pq.size() == k) {
                System.out.print(pq.peek()+" ");
            } else {
                System.out.print("_ ");
            }
        }

            
        

    }
}
