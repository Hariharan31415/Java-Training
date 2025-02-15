package day19;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	
	int data ;
	Node left , right;
	
	public Node(int data)
	{
		this.data=data;
		left=right=null;
	}
	
}

class BinaryTree{
	
	Node root = null;
	public void preOrder(Node root)
	{
		if(root==null)
		{System.out.println("empty");return ;}
		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
			
	}
	
	public void postOrder(Node node)
	{
		if(node==null)
		{System.out.println("empty"); return;}
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.data);
		
		
	}
	public void inOrder(Node node)
	{
		if(node==null)
		{System.out.println("empty");return;}
		inOrder(node.left);
		System.out.println(node.data);
		inOrder(node.right);
	}
	public void levelOrder()
	{
		if(root==null)
		{return;}
		Queue<Node> q = new LinkedList();
		q.add(root);
		while(!q.isEmpty())
		{
			Node temp = q.poll();
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
	
	public void insertion(int data)
	{
		root=ef(root,data);
	}
	
	public Node ef(Node root , int data)
	{
		if(root==null)
		{
		 root=new Node(data);
		 return root;
		}
		
		if(data<root.data)
		{
			root.left=ef(root.left,data);
		}
		else if(data>root.data)
		{
			root.right=ef(root.right,data);
		}
		
		return root;
		
	}
}


public class task1 {
public static void main(String args[])
{
	
	BinaryTree t = new BinaryTree();

	t.root = new Node(1);
	t.root.left=new Node(2);
	t.root.right=new Node(3);
	t.root.left.left= new Node(4);
	t.root.left.right=new Node(5);
	System.out.println("Pre order");
	t.preOrder(t.root);
	System.out.println("Post order");
	t.postOrder(t.root);
	System.out.println("In order");
	t.inOrder(t.root);
	
	t.levelOrder();
	
	
	
	
	
	
}
}
