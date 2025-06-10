import java.util.ArrayList;

public class CycleDetect {
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
        graph[1].add(new Edge(1, 2, 1));

        // Vertex 2
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 1, 1));

        // Vertex 3
        graph[3].add(new Edge(3, 0, 1));
        graph[3].add(new Edge(3, 4, 1));

        // Vertex 4
        graph[4].add(new Edge(4, 3, 1));

    }
    
    public static boolean detectcycle(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                return detectcycleutil(graph, vis, 0, -1);
            }
        }
        return false;
    }

    public static boolean detectcycleutil(ArrayList<Edge> graph[], boolean vis[], int curr, int par) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.Destination]) {
                if (detectcycleutil(graph, vis, e.Destination, curr)) {
                    return true;
                }
            } else if (vis[e.Destination] && e.Destination != par) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph []= new ArrayList[V];
        /*
            0 -----3
           /|      |
          / |      |
         1  |      4
          \ |      
           \|
            2
         
         */
        CreateGraph(graph);
        System.out.println(detectcycle(graph));
    }



}
