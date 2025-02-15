package day21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task1 {
public static void main(String args[])
{
Scanner s = new Scanner(System.in);	
int v , e , sn , dn;
System.out.println("enter the No of vertex :");
v=s.nextInt();
System.out.println("enter the no of edges :");
e = s.nextInt();
List<List<Integer>> graph = new ArrayList<List<Integer>>();


for(int i=0;i<v;i++)
{
	graph.add(new ArrayList<Integer>());
	
}
for(int i=0;i<e;i++)
{
	 sn = s.nextInt();
    dn = s.nextInt();
    //int wt = s.nextInt();
    graph.get(sn).add(dn);  // Add edge from dn to sn
    graph.get(dn).add(sn);  // If it's an undirected graph, add reverse edge

}


for(int i=0;i<v;i++)
{
	System.out.println(i);
	for(int neigh : graph.get(i))
	{
		System.out.println("-->"+neigh);
	}

}

}
}
