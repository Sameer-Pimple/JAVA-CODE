import java.util.ArrayList;

public class AllPath {
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

    public static void Printpath(ArrayList<Edge> graph[], boolean vis[], int curr, String path, int tar) {
        if (curr == tar) {
            System.out.println(path);
            return;
        }                  

        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.Destination]) {
                Printpath(graph, vis, e.Destination, path + e.Destination, tar);
            }
        }
        vis[curr] = false;

    }

    public static void main(String[] args) {
        /*
             
            1 -----3
           /       | \
          0        |  5 -- 6
           \       | /
            2 -----4
         */
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        CreateGraph(graph);
        int sorce = 0, tar = 5;
        Printpath(graph, new boolean[V], sorce, "0", tar);
    }
}