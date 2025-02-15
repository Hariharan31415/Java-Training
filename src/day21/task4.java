package day21;

import java.util.*;

class GraphBfs
{
	int ver;
	LinkedList<Integer> adj[];
	
 public GraphBfs(int ver)
 {
	 this.ver=ver;
	 this.adj= new LinkedList[ver+1];
	 for(int i=1;i<=ver;i++)
	 {
		 adj[i] = new LinkedList();
	 }
	 
 }
 
 public void addEdge(int src , int des)
 {
	 adj[src].add(des);
	 adj[des].add(src);
 }

public void BFS(int start)
{
	boolean visted[] = new boolean[ver+1];
	System.out.println(Arrays.toString(visted));
	Queue<Integer> q = new LinkedList();
	visted[start]=true;
	q.offer(start);
	while(!q.isEmpty())
	{
		int node = q.poll();
		System.out.println(node);
		for(int n : adj[node])
		{
			if(!visted[n])
			{
				visted[n]=true;
				q.offer(n);
			}
		}
	}
	
	
}
 
}

public class task4 {
public static void main(String args[])
{
	
GraphBfs g = new GraphBfs(6);
g.addEdge(1,2);
g.addEdge(1,3);
g.addEdge(2,4);
g.addEdge(2,5);
g.addEdge(3,6);

g.BFS(1);


}
}
