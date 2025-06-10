import java.util.ArrayList;
import java.util.Stack;

//Topological is graph directed graph which does not having a cycle...
// WE have solve this que Using DFS...
public class TopologicalQue {
    static class Edge {
        int source;
        int Destination;

      public  Edge(int s, int d) {
            this.source = s;
            this.Destination = d;
        }
    }

    public static void CreateGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void Topsort(ArrayList<Edge> graph[]) {

        boolean vis[] = new boolean[graph.length];
        Stack<Integer> Recur = new Stack<>();

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                Topsortutil(graph, vis, i, Recur); // Modified DFS
            }
        }
        while (!Recur.isEmpty()) {
            System.out.print(Recur.pop() + " ");
        }
    }

    public static void Topsortutil(ArrayList<Edge> graph[], boolean vis[], int curr, Stack<Integer> Recur) {

        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.Destination]) {
                Topsortutil(graph, vis, e.Destination, Recur);
            }
        }
        Recur.push(curr);
        

    }

    public static void main(String[] args) {
        int V = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        CreateGraph(graph);
        Topsort(graph);
    }
}
