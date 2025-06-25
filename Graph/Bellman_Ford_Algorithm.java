import java.util.ArrayList;

// it is a algorithm which is used to find the shortest route from source to destination with -ve weight edges....dijkstras does not work with -ve edge weight
// this Belloman ford algorithm is also not work for -ve Weight cycle.
public class Bellman_Ford_Algorithm {
    public static class Edge {
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

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));
    }

    public static void Bellman(ArrayList<Edge> graph[], int sor, int V) {
        //here we have set infinity to all destination
        int dest[] = new int[V];
        for (int i = 0; i < V; i++) {
            if (i != sor) {
                dest[i] = Integer.MAX_VALUE;
            }
        }
        // here we start the loop for graph
        for (int i = 0; i < V; i++) {
            //this loop is for neibour of vertex
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j); // get the neibour
                int u = e.sor;// neibour ka sorce
                int v = e.dest;// neibour ka destination

                if (dest[u] != Integer.MAX_VALUE && dest[u] + e.wt < dest[v]) {
                    dest[v] = dest[u] + e.wt;
                }
            }
        }
        for (int i = 0; i < dest.length; i++) {
            System.out.print(dest[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        CreateGraph(graph);
        Bellman(graph, 0, V);
    }
}
