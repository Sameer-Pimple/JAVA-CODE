package Heap;

import java.util.PriorityQueue;

public class LQue5 {
    public static class Pair implements Comparable<Pair> {
        int val;
        int Idx;

        public Pair(int val, int Idx) {
            this.val = val;
            this.Idx = Idx;
        }
        @Override
        public int compareTo(Pair p2) {
            //for assending return this.val - p2.val;
            return p2.val - this.val;
        }

    }
    public static void main(String args[]) {
        int arr[] = { 1, 3, -1,-3,5,3,6,7};
        int k = 3;
        int n = arr.length;
        int ans[] = new int[n - k + 1];

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        //Step1 adding values in Priority Queue
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i], i));
        }

        ans[0] = pq.peek().val;

        for (int i = k; i < n; i++) {
            while (pq.size() > 0 && pq.peek().Idx <= (i - k)) {
                pq.remove();
            }

            pq.add(new Pair(arr[i], i));
            ans[i - k + 1] = pq.peek().val;
        }
        //print 
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        
    }
}
