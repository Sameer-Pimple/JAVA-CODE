import java.util.*;
import java.util.LinkedList;
// This is the Que in Graph Where we have to find the shortest route bwteen the nodes with cheapest price 
/*
 There are m cities connected by some number od flights.you are given an array flights where flights[i] =[From,to,price]
 indicatethat there is a flight.
 you are aslo given three integers src,dist,and k, return the chepest price from src to dist with at most k stops.
 if there is no such route , retuen -1.
 */
public class Lque1 {
    
    public static class Edge {
        int sor, dest, wt;

        public Edge(int s, int d, int w) {
            this.sor = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static class Info { // this class is used to store info about vertex to calculate cost
        int vertex;
        int cost;
        int stops;

        public Info(int v, int c, int s) {
            this.vertex = v;
            this.cost = c;
            this.stops = s;
        }
    }

    public static void CreateGraph(int flights[][], ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        for (int i = 0; i < flights.length; i++) {
            int sor = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];

            graph[sor].add(new Edge(sor, dest, wt));
        }
    }
    
    public static int cheapestFlight(ArrayList<Edge>graph[],int flights[][], int n, int src, int dest, int k) {
        int dist[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));
        
        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr.stops > k) {
                break;
            }
            for (int i = 0; i < graph[curr.vertex].size(); i++) {
                Edge e = graph[curr.vertex].get(i);
                int u = e.sor;
                int v = e.dest;
                int wt = e.wt;

                if (dist[u] != Integer.MAX_VALUE && curr.cost+ wt < dist[v] && curr.stops <= k) { //  here we use curr.cost insted of dist[u] beacuse dist[u] get the cost of maxi stop route and it changes it.. so we use curr.cost to get accurate route cost.
                    dist[v] = dist[u] + wt;
                    q.add(new Info(v, dist[v], curr.stops + 1));
                }
            }

        }
        if (dist[dest] == Integer.MAX_VALUE) {
            return -1;
        } else {
            return dist[dest];
        }
    }
    public static void main(String args[]) {
        int n = 4, src = 0, dest = 3, k = 1;

        int flights[][] = { { 0, 1, 100 }, { 1, 2, 100 }, { 2, 0, 100 }, { 1, 3, 600 }, { 2, 3, 200 } };
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[n];
        CreateGraph(flights, graph);
        System.out.println(cheapestFlight(graph, flights, n, src, dest, k));
    }
}
