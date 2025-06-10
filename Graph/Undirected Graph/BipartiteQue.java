
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Bipartite Que 
public class BipartiteQue {
    static class Edge {
        int source;
        int Destination;

        public Edge(int s, int d) {
            this.source = s;
            this.Destination = d;
        }
    }

    public static void CreateGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // Vertex 0
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        // Vertex1
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        // Vertex2
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        // Vertex3
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        // Vertex4
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));

    }

    
    
    public static boolean isBipartite(ArrayList<Edge> graph[]) {
        int col[] = new int[graph.length]; 
        for (int i = 0; i < col.length; i++) {
            col[i] = -1; // no color
        }

        Queue<Integer> q = new LinkedList<>();


        for (int i = 0; i < graph.length; i++) {

            if (col[i] == -1) { //BFS
                q.add(i);
                col[i] = 0;//yellow

                while (!q.isEmpty()) {

                    int curr = q.remove();

                    for (int j = 0; j < graph[curr].size(); j++) {

                        Edge e = graph[curr].get(j);

                        if (col[e.Destination] == -1) {
                            //Techniuqe 1
                            int nextcol;
                            
                            if (col[ curr] == 0) {
                                nextcol = 1;
                            } else {
                                nextcol = 0;
                            }
                            //Techniuqe 2
                            //int nextcol = col[curr] == 0 ? 1 : 0;

                            col[e.Destination] = nextcol;
                            q.add(e.Destination);

                        } 
                        else if (col[e.Destination] == col[curr]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true  ;
    }

    public static void main(String[] args) {
        
        /*
        If graph does not hava cycles then by defalte it is bipitrite graph  
           0 ----- 2
          /       /
         /       /
        1       4
         \     / 
          \  /
           3
           FALSE
        
        */
         int V = 5;
         ArrayList<Edge> graph[] = new ArrayList[V];
         CreateGraph(graph);
        System.out.println(isBipartite(graph));
    }
}
