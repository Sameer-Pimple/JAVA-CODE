package LectureQue;
import java.util.*;

public class Que2 {
    public static class Edge {
        int sor;
        int dest;

        public Edge(int s, int d) {
            this.sor = s;
            this.dest = d;
        }
    }

    public static void CreateGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    public static void MothervertexDFS(ArrayList<Edge> graph[], int V) {
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[V];

        dfs(graph, vis, 0, s);
       
        System.out.println(s.peek());
    }

    public static void dfs(ArrayList<Edge> graph[], boolean vis[], int curr, Stack<Integer> s) {
        if (!vis[curr]) {
            vis[curr] = true;
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if (!vis[e.dest]) {
                    dfs(graph, vis, e.dest, s);
                }
            }
            s.push(curr);
        }
    }

    public static void main(String[] args) {
        int V = 5;

        @SuppressWarnings("unchecked")

        ArrayList<Edge> graph[] = new ArrayList[V];
        CreateGraph(graph);
        MothervertexDFS(graph,V);
    }

}