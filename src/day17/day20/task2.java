package day20;

class Node1 {
    int data,height;
    Node1 left, right;

    public Node1(int data) {
        this.data = data;
        left = right = null;
        height=1;
    }
}

class AVL 
{
	Node1 root=null;
	
  public Node1 insert(Node1 node , int data)
  {
	  if(node==null)
	  {
		 node = new Node1(data);
		 
	  }
	  if(data<node.data)
	  {
		  node.left=insert(node.left,data);
	  }
	  else if(data>node.data)
	  {
		  node.right=insert(node.right,data);
	  }
	  else {
		  return node;
	  }
	  node.height=Math.max(height(node.left),height(node.right))+1;
	  
	  
	  int bal=getBalance(node);
	  
	  if(bal>1 && data<node.left.data)
	  {
		  return rightRotate(node);
	  }
	  if(bal<-1 && data>node.right.data)
	  {
		  return leftRotate(node);
	  }
	  
	  if(bal>1 && data>node.left.data)
	  {
		  node.left=leftRotate(node.left);
		  return rightRotate(node);
	  }
	  if(bal<-1 && data<node.right.data)
	  {
		  node.right=rightRotate(node.right);
		  return leftRotate(node);
	  }
	  
	  return node;
  }

public int getBalance(Node1 node)
{
	return node==null ?0: height(node.left)-height(node.right);

}

public int height(Node1 node)
{
	return node==null?0:node.height;
}

public Node1 rightRotate(Node1 y )
{
	
   Node1 x, t2 ;
   x = y.left;
   t2=x.right;
   x.right=y;
   y.left=t2;
   y.height=(Math.max(height(y.left), height(y.right)))+1;
   x.height=(Math.max(height(x.left), height(x.right)))+1;
   
 
   return x;

}

public Node1 leftrotate(Node1 x)
{
	
	 Node1 y, t2 ;
	    y= x.left;
	   t2=y.right;
	  
	   
	   x.right=t2;
	  
	   x.height=(Math.max(height(x.left), height(x.right)))+1;
	   y.height=(Math.max(height(y.left), height(y.right)))+1;

 return y;
}


public Node1 min(Node1 node)
{
	while(node.left!=null)
		{
		node = node.left;
		return node;
		}
}




}


public class task2 {
	public static void main(String args[]) {
	AVL t = new AVL();
	t.insert(t.root,30);
	
	//t.delete(t.root, 12);
	}
}
