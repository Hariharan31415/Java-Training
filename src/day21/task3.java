package day21;


import java.util.*;

class Graph{

 static class Edge{

 int dest;
 int weight;

 public Edge(int dest, int weight) {

  this.dest = dest;

  this.weight = weight;
  
 }

 }

 int vertex;

 Map<Integer,List<Edge>> adj;

 Graph( int vertex){

 this.vertex=vertex;

 this.adj=new HashMap<>();

 for(int i=0;i<vertex;i++) {

  adj.put(i, new LinkedList<>());

 }

 }

 public void addEdge(int sr, int ds, int weight) {

 adj.get(sr).add(new Edge(ds,weight));

 }

 public void printGraph() {

 for(int node : adj.keySet()) {

System.out.print("node "+node + "->");

for(Edge edge : adj.get(node)) {

 System.out.print("{"+"Dest: "+edge.dest+" Weight: "+edge.weight+"}");

}

 System.out.println();

 }

 }

}

public class task3 {

  public static void main(String[] args) {

 Graph g=new Graph(5);

 g.addEdge(0,1,4);
	g.addEdge(0,2,1);
	g.addEdge(2,3,1);
	g.addEdge(2,1,3);
	g.addEdge(3,4,7);

 g.printGraph();

 }

}





















