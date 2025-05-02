package Heap;

import java.util.PriorityQueue;

public class LQue4 {
    public static class Strong implements Comparable<Strong> {
        int Row;
        int Idx;
        int Soldger;

        public Strong(int Row, int Idx,int Soldger) {
            this.Row = Row;
            this.Idx = Idx;
            this.Soldger = Soldger;
        }
        @Override
        public int compareTo(Strong s1) {
            if (this.Soldger == s1.Soldger) {
                return this.Idx - s1.Idx;
            } else {
                return this.Soldger - s1.Soldger;
            }
        }
    }
    public static void main(String args[]) {
        int army[][] = {{ 1, 0, 0, 0 },
                        { 1, 1, 1, 1 },
                        { 1, 0, 0, 0 },
                        { 1, 0, 0, 0 }};
        
        
        PriorityQueue<Strong> pq = new PriorityQueue<>();
        int k = 2;
        int row = 4;
        int col = 4;
        
        for (int i = 0; i < row; i++) {
            int count = 0;
            for (int j = 0; j < col; j++) {
                count += army[i][j] == 1 ? 1 :0;
            }
            pq.add(new Strong(row, i, count));
        }
        for (int i = 0; i < k; i++) {
            System.out.println("Weakest Sloger = Row "+pq.remove().Idx);
        }
        
    }
}
