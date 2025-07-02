import java.util.*;
//Find the minimum cost for connecting all cities on the map.(it is Solve using MST Minimum Spinning tree...where we use Priority Que to short cost to collect minimum cost)
// it is also called prims Algorithm
public class Lque2 {
    public static class Edge implements Comparable<Edge> {
        int dest;
        int cost;

        public Edge(int d, int c) {
            this.dest = d;
            this.cost = c;
        }

        public int compareTo(Edge c2) {
            return this.cost - c2.cost;
        }
    }

    public static int Connecctedcities(int cities[][]) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[cities.length];

        pq.add(new Edge(0, 0));

        int FinalCost = 0;
        
        while (!pq.isEmpty()) {
            Edge curr = pq.remove();
            if (!vis[curr.dest]) {
                vis[curr.dest] = true;
                FinalCost += curr.cost;
                for (int i = 0; i < cities[curr.dest].length; i++) {
                    if (!vis[i] && cities[curr.dest][i] != 0){
                        pq.add(new Edge(i, cities[curr.dest][i]));
                    }
                }
            }
        }

        return FinalCost;
    }
    

    public static void main(String[] args) {
        int cities[][] = { { 0, 1, 2, 3, 4 },
                { 1, 0, 5, 0, 7 },
                { 2, 5, 0, 6, 0 },
                { 3, 0, 6, 0, 0 },
                { 4, 7, 0, 0, 0 } };
                System.out.println(Connecctedcities(cities));
    }
    
}
