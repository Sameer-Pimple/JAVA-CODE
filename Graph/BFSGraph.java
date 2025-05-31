package Graph;
import java.util.*;

public class BFSGraph {
    static class Edge {
        int source;
        int Destination;
        int weight;

        Edge(int s, int d, int w) {
            this.source = s;
            this.Destination = d;
            this.weight = w;
        }
    }

    public static void CreateGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // Vertex 0
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        // Vertex 1
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        // Vertex 2
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        // Vertex 3
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        // Vertex 4
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        //Vertex 5
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        //Vertex 6
        graph[6].add(new Edge(6, 5, 1));

    }

    public static void BFS(ArrayList<Edge> graph[]) {
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];

        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.Destination);
                }
            }
        }
    }
    
    public static void DFS(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.Destination]) {
                DFS(graph, e.Destination, vis);
            }
        }

    }

    public static boolean Haspath(ArrayList<Edge> graph[], int src, int dest, boolean vis[]) {
        if (src == dest) {
            return true;
        }

        vis[src] = true;
         
        for (int i = 0; i < graph[src].size(); i++) {

            Edge e = graph[src].get(i);
              
            if (!vis[e.Destination] && Haspath(graph, e.Destination, dest, vis)) {
                return true;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        /*
        
            1 --- 3
          /       | \
         0        |  5 -- 6 
          \       | / 
           2 ---- 4
         */

        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[7];
        CreateGraph(graph);
        System.out.print("BSF Output : ");
        BFS(graph);
        System.out.println();
        System.out.print("DSF Output : ");
        DFS(graph, 0, new boolean[V]);
        System.out.println();
        System.out.println("It has path : "+ Haspath(graph, 0, 5, new boolean[V]));
        
    }
}
