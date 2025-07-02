
/*
In this Que There is a concept as Connected Component here there is a Graph which has
two seperate component but it is One Graph we have to traverse the full graph but if we try 
we can't trverse because its Vertex(That Node) is not connected so we use a dfs inside a dfc so we can traverse the both

    0          4 --- 5 
   / \              /
  1   2            6
       \       Consider this is a One graph but it is seperate 
        3

*/ 

import java.util.*;
public class ComponentGraph {
    static class Edge {
        int source;
        int destination;
        int weight;

        Edge(int s, int d, int w) {
            this.source = s;
            this.destination = d;
            this.weight = w;
        }
    }

    static void CreateGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // Vertex 0
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        // Vertex 1
        graph[1].add(new Edge(1, 0, 1));

        // Vertex 2
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 3, 1));

        // Vertex 3
        graph[3].add(new Edge(3, 2, 1));

        // Vertex 4
        graph[4].add(new Edge(4, 5, 1));

        // Vertex 5
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        // Vertex 6
        graph[6].add(new Edge(6, 5, 1));

    }

    static void DFS(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                System.out.print("Component: ");
                DFSUtil(graph, i, vis);
                System.out.println();   
            }
        }
    }

    static void DFSUtil(ArrayList<Edge> graph[], int sor, boolean vis[]) {
        System.out.print(sor + " ");
        vis[sor] = true;
        for (int i = 0; i < graph[sor].size(); i++) {
            Edge e = graph[sor].get(i);
            if (!vis[e.destination]) {
                DFSUtil(graph, e.destination, vis);
            }
        }
    }
    
    static void BSF(ArrayList<Edge> graph[]) {
        
    }

    public static void main(String args[]) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        CreateGraph(graph);
        DFS(graph);
    }
}
