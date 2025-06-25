import java.util.*;
//Dijkstras Algorithm is used in a Graph data structure to finding the shortest path from source to destination....it is not work if the weight is in negative(Time complexity = E)
public class Dijkstra_Algorithm {
    static class Edge {
        int sor;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.sor = s;
            this.dest = d;
            this.wt = w;
        }  
    }

    public static void CreateGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

    }

    public static class pair implements Comparable<pair>{
        int node;
        int dist;

        public pair(int n, int d) {
            this.node = n;
            this.dist = d;
        }
        @Override
        public int compareTo(pair p2) {
            return this.dist - p2.dist;
        }
    }

    public static void Dijkstra(ArrayList<Edge> graph[], int sor, int V) {
        PriorityQueue<pair> pq = new PriorityQueue<>();
        int dist[] = new int[V];
        for (int i = 0; i < V; i++) {
            if (i != sor) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[V];
        pq.add(new pair(sor, 0));

        // Dijkstra uses BFS with a priority queue (greedy approach)

        while (!pq.isEmpty()) {
            pair curr = pq.remove();
            if (!vis[curr.node]) {
                vis[curr.node] = true;

                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    int u = e.sor;  //neibour ka source
                    int v = e.dest; // neibour ka distance
                    if (dist[u] + e.wt < dist[v]) {
                        dist[v] = dist[u] + e.wt;
                        pq.add(new pair(v, dist[v]));
                    }
                }
            }
        }
        for (int i = 0; i <V; i++) {
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int V = 6;
        
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        CreateGraph(graph);
        Dijkstra(graph, 0, V);
    }
}
