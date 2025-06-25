package LectureQue;

import java.util.ArrayList;

public class Que1 {
    //Detect Cycle in a Undirected Graph...

    public static class Edge {
        int sor;
        int desti;

        public Edge(int s, int d) {
            this.sor = s;
            this.desti = d;
        }
    }

    public static void CreateGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // Vertex 0
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        // Vertex 1
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        // Vertex 2
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        // Vertex 3
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        // Vertex 4
        graph[4].add(new Edge(4, 3));

    }
    
    public static boolean isCycle(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                return isCycleutil(graph, vis, 0, -1);
            }  
        }
        return false;
    }

    public static boolean isCycleutil(ArrayList<Edge> graph[], boolean vis[], int curr, int par) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.desti]) {
                if (isCycleutil(graph, vis, e.desti, curr)) {
                    return true;
                }
            }
            else if (vis[e.desti] && e.desti != par) {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        CreateGraph(graph);
        System.out.println(isCycle(graph));

    }
    
}
