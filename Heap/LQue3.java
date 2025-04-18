package Heap;

import java.util.PriorityQueue;

//this Que is finding the minimum cost of rope to connect...here if we connect 2 rope then when we conecting that rope with another rope then it will add the previous ropes values in this first rope...
public class LQue3 {
    public static void main(String[] args) {
        int ropes[] = { 2, 3, 3, 4, 6 };
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }
        int cost = 0;
        while (pq.size() > 1) {
            int min = pq.remove();
            int min2 = pq.remove();
            cost += min + min2;
            pq.add(min+min2);

        }
        System.out.println("The Minimum value of Connecting Rope = " + cost);


    }
}
 