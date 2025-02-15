package day21;
import java.util.*;
class Graph1{
	int vertex;
	Map<Integer, LinkedList<Edge>> adl;
	
	static class Edge
	{
		int des, weight;
		Edge(int destination , int weight)
		{
			this.des=des;
			this.weight=weight;
		}
	}
	public Graph(int vertex)
	{
		this.vertex=vertex;
		adl = new HasMap<>();
	    
	    for(int i=0;i<vertex;i++)
	    {
	    	adl.put(i,new LinkedList());
	    }
		
	}
    
    
    public void addEdge(int s,int des,int weight)
    {
    	adl.get(s).add(new Edge(des,weight));
    }
    
    public void printGraph()
    {
    	for(int node : adl.keySet())
    	{
    		System.out.println("node "+node+"-->");
    		for(Edge edge : adl.get(node))
    		{
    			System.out.println("("+edge.des+","+edweight+")");
    		}
    		System.out.println();
    	}
    }
	
}



public class task2 {
public static void main(String args[])
{
	Graph g = new Graph(4);
	g.addEdge(0,1,4);
	g.addEdge(0,2,1);
	g.addEdge(2,3,1);
	g.addEdge(2,1,3);
	g.addEdge(3,4,7);
	
	g.printGraph();
	
	
}
}
