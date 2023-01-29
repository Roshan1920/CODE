import java.util.*;
public class graph01{
    static class Edge{
    int src;
    int dest;

    public Edge(int s, int d){
        this.src=s;
        this.dest=d;
    }
 }

 public static void createGraph(ArrayList<Edge> graph[]) {
    for(int i=0;i<graph.length;i++) {
        graph[i] = new ArrayList<Edge>();
    }
    graph[0].add(new Edge(s:0,d:2));

    graph[1].add(new Edge(s:1,d:2));
    graph[1].add(new Edge(s:1,d:3));

    graph[2].add(new Edge(s:2,d:0));
    graph[2].add(new Edge(s:2,d:1));
    graph[2].add(new Edge(s:2,d:3));

    graph[3].add(new Edge(s:3,d:1));
    graph[3].add(new Edge(s:3,d:2));
 }
 public static void main(String args[]){
    int V = 4;

    ArrayList<Edge> graph[] = new ArrayList[V];
   }
 
}
}
