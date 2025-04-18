package Heap;
// finding the shortest point near thr origin
import java.util.*;

public class LQue2 {
    public static class Point implements Comparable<Point> {
        int x;
        int y;
        int digtsq;
        int Idx;

        public Point(int x, int y, int digtsq, int Idx) {
            this.x = x;
            this.y = y;
            this.digtsq = digtsq;
            this.Idx = Idx;
        }
        @Override
        public int compareTo(Point p2) {
            return this.digtsq - p2.digtsq;
        }

    }
   
    public static void main(String args[]){
        int pts[][]= {{3,3},{5,-1},{-2,4}};
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            int digtsq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], digtsq, i));
        }
        for (int i = 0; i < k; i++) {
            System.out.println("C "+pq.remove().Idx);
        }
    }
}