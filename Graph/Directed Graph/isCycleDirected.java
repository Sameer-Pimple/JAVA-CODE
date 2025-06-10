import java.util.*;

public class isCycleDirected {
    static class Edge {
        int source;
        int destination;

        Edge(int sor, int dest) {
            this.source = sor;
            this.destination = dest;
        }
    }

    public static void CreateGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));
    }

    public static boolean Cyclecheck(ArrayList<Edge> graph[], boolean vis[], boolean rec[], int curr) {
        vis[curr] = true;
        rec[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (rec[e.destination]) {
                return true;
            } else if (!vis[e.destination]) {
                return Cyclecheck(graph, vis, rec, e.destination);
            }
        }
        rec[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        CreateGraph(graph);
        System.out.println(Cyclecheck(graph, new boolean[V], new boolean[V], 0));
    }
}