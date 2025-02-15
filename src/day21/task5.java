package day21;

import java.util.Iterator;
import java.util.LinkedList;

class GraphDfs
{
	int ver;
	LinkedList<Integer> adj[];

	public GraphDfs(int ver)
	{
		this.ver=ver;
		 this.adj= new LinkedList[ver+1];
		 for(int i=1;i<=ver;i++)
		 {
			 adj[i] = new LinkedList();
		 }

	}
	
	
	void addEdges(int src , int des)
	{
		adj[src].add(des);
		
	}
	
	
	void DFS(int start)
	{
		boolean visted[] = new boolean[ver+1];
		Iterator<Integer> it = adj[start].listIterator();
		while(it.hasNext())
		{
			visted[start]=true;
			
			int node=it.next();
			System.out.println(node);
			if(!visted[node])
			{
				DFS(node);
				//System.out.println(node);
			}
		}
	}

}
public class task5 {
	public static void main(String args[])
	{
	  GraphDfs g =  new GraphDfs(4);
    g.addEdges(1,2);
    g.addEdges(1,3);
    g.addEdges(2,3);
    g.addEdges(3,4);
    
    g.DFS(2);

}
}