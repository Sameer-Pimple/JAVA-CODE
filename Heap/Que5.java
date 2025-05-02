package Heap;

import java.util.LinkedList;
import java.util.PriorityQueue;
public class Que5 {
    public static void main(String args[]) {
        LinkedList<Integer> list1 = new LinkedList<>(); 
        LinkedList<Integer> list2 = new LinkedList<>(); 
        LinkedList<Integer> list3 = new LinkedList<>();
        
        list1.add(1);
        list1.add(3);
        list1.add(7);
        list2.add(2);
        list2.add(4);
        list2.add(8);
        list3.add(9);
        list3.add(10);
        list3.add(11);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.addAll(list1);
        pq.addAll(list2);
        pq.addAll(list3);

        while (!pq.isEmpty()) {
            System.out.print(pq.poll()+" ");
        }
    }
}