package day19;

import java.util.LinkedList;
import java.util.Queue;

class Node1 {
	
	int data ;
	Node1 left , right;
	public Node1(int data)
	{
	this.data=data;
	right=left=null;
	}	
}

class B_Tree
{
	Node1 root=null;
	
	public void preOrder(Node1 node)
	{
		if(node==null)
		{return;}
		System.out.println(node.data);
		preOrder(node.left);
		preOrder(node.right);
		
	}
	public void InOrder(Node1 node)
	{
		if(node==null)
		{return;}
		InOrder(node.left);
		System.out.println(node.data);
		InOrder(node.right);
		
	}
	public void postOrder(Node1 node)
	{
		if(node==null)
		{return;}
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.data);
		
	}
	
	public void levelOrder() {
		if(root==null)
		{return;}
		Queue<Node1> q = new LinkedList();
		q.add(root);
		while(!q.isEmpty())
		{
			Node1 temp = q.poll();
			System.out.println(temp.data);
			if(temp.left!=null)
			{
				q.add(temp.left);
			}
			if(temp.right!=null)
			{
				q.add(temp.right);
			}
		}
		
		
	}
	
	
	public void rightView(Node1 root)
	{
		
		if(root==null)
		{return;}
		Queue<Node1> q = new LinkedList();
		q.add(root);
		while(!q.isEmpty())
		{
			int n = q.size();
			for(int i =1;i<=n;i++)
			{
				Node1 temp = q.poll();
				if(i==n)
				{System.out.println(temp.data);}
				if(temp.left!=null)
				{
					q.add(temp.left);
				}
				if(temp.right!=null)
				{
					q.add(temp.right);
				}
				
			}
		}
		
		
		
	}
	
	public void leftView(Node1 root)
	{
		
		if(root==null)
		{return;}
		Queue<Node1> q = new LinkedList();
		q.add(root);
		while(!q.isEmpty())
		{
			int n = q.size();
			for(int i =1;i<=n;i++)
			{
				Node1 temp = q.poll();
				if(i==n)
				{System.out.println(temp.data);}
				if(temp.left!=null)
				{
					q.add(temp.left);
				}
				if(temp.right!=null)
				{
					q.add(temp.right);
				}
				
			}
		}
		
		
		
	}
	
	public int height_depth(Node1 node , int arr[])
	{
		
		if(node==null)
		{return 0;}
		int leftH = height_depth(node.left,arr);
		int rightH = height_depth(node.right,arr);
		//System.out.println(arr[0]=Math.max(arr[0], leftH+rightH+1));
		return 1+Math.max(leftH, rightH);
	
	}
	
	public int height(Node1 node)
	{
		
		if(node==null)
		{return 0;}
		int leftH = height(node.left);
		int rightH = height(node.right);
		return 1+Math.max(leftH, rightH);
	}
	
	public String serialize(Node1 root)
	{
		//level order
		
		if(root==null)
		{return "empty";}
		
		Queue<Node1> q = new LinkedList();
		q.add(root);
		StringBuilder sb = new StringBuilder();
		while(!q.isEmpty())
		{
			Node1 temp = q.poll();
			if(temp==null)
			{
			sb.append("null , ");
			continue;
			}
			sb.append(temp.data).append(" , ");
			q.add(temp.left);
			q.add(temp.right);
		}
		return sb.toString();
	}
	
	public String serializePre(Node1 root)
	{
		
		StringBuilder sb = new StringBuilder();
		serialStr(root , sb);
		return sb.toString();
		
	}
	
	public void serialStr(Node1 node,StringBuilder sb)
	{
		if(node==null)
		{
			sb.append("null , ");
			return ;
		}
		sb.append(node.data).append(" ,");
		serialStr(node.left , sb);
		serialStr(node.right,sb);
		
		
		
	}
	
	public Node1 deSerializePre(String data)
	{
		
		StringBuilder sb = new StringBuilder();
		String arr[] = data.split(",");
		int[] index = {0};
		return deSerializePreStr(arr,index);

	}
	
	public static Node1 deSerializePreStr(String arr[],int[] index)
	{
		if(index[0]>=arr.length||arr[index[0]].equals("null"))
		{
			index[0]++;
			return null;
		}
		
		Node1 temp = new Node1(Integer.parseInt(arr[index[0]]));
		temp.left=deSerializePreStr(arr,index);
		temp.right=deSerializePreStr(arr,index);
	    return temp ;
	}
	
  
}



public class task3 {
	public static void main(String args[])
	{
		
		B_Tree t = new B_Tree();
		t.root = new Node1(1);
		t.root.left = new Node1(2);
		t.root.right=new Node1(3);
		t.root.left.left = new Node1(4);
		t.root.left.right=new Node1(5);
		t.root.right.right=new Node1(6);
		int arr[] = new int[10];
		
		System.out.println("pre order traversal ...");
		t.preOrder(t.root);
		System.out.println("In order traversal ...");
		t.InOrder(t.root);
		System.out.println("post order traversal ...");
		t.postOrder(t.root);
		System.out.println("right view");
		t.rightView(t.root);
		System.out.println("left view");
		t.leftView(t.root);
		System.out.println("HEIGHT & DEPTH");
		System.out.println(t.height_depth(t.root,arr));
		System.out.println("height");
		System.out.println(t.height(t.root));
		
		System.out.println(t.serialize(t.root));
		
		
		System.out.println("serialize pre order");
		System.out.println(t.serializePre(t.root));
		
		System.out.println("deSeri");
		String s = t.serializePre(t.root);
		Node1 root = t.deSerializePre(s);
		
		
	}
}
