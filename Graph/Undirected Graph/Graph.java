import java.util.*;

public class Graph {
    static class Edge {
        int source;
        int Destination;
        int weight;

        public Edge(int s, int d, int w) {
            this.source = s;
            this.Destination = d;
            this.weight = w;
        }
    }

    public static void CreateGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        /*
             (5)
        0 --------1
                /   \
               /     \
           (1)/       \(3)
             /         \
            2 --------- 3
            |     (1)
         (2)|
            |
            4
        
        
         */
        //Vertex 0
        graph[0].add(new Edge(0, 1, 5));

        //Vertex 1
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        //Vertex 2
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        //Vertex 3
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        //Vertex 4
        graph[4].add(new Edge(4, 2, 2));

    }

   
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        CreateGraph(graph);



        // for (int i = 0; i < graph[2].size(); i++) {
        //     Edge e = graph[2].get(i);
        //     System.out.print(e.Destination+" ");
        // }
    }
}
