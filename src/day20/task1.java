package day20;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Tree {
    Node root = null;

    public void insert(int d) {
        root = insertRecursive(root, d);
    }

    private Node insertRecursive(Node root, int d) {
        if (root == null) {
            return new Node(d);
        }
        if (d < root.data) {
            root.left = insertRecursive(root.left, d);
        } else {
            root.right = insertRecursive(root.right, d);
        }
        return root;
    }

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    public boolean search(int data) {
        return searchRecursive(root, data);
    }

    public boolean searchRecursive(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (data == root.data) {
            return true;
        }
        return data < root.data ? searchRecursive(root.left, data) : searchRecursive(root.right, data);
    }
    
    
    public int minVal(Node root)
    {
    	while(root.left!=null)
    	{
    		root = root.left;
    	}
    	
    	return root.data;
    }
    public int maxVal(Node root)
    {
    	while(root.right!=null)
    	{
    		root = root.right;
    	}
    	
    	return root.data;
    }
    
    public boolean isValid(Node root,Integer min , Integer max)
    {
    	if(root==null)
    	{return true;}
    	if((min!=null && root.data<=min) || (max!=null && root.data>=max))
    	{return false;
    		
    	}
    	return isValid(root.left,min,root.data) && isValid(root.right,root.data,max);
    	}
    
    public int KthSmall(Node root,int k)
    {
    	int[] count= {0};
    	int[] result= {-1};
    	kSmallEle(root,k,count,result);
     	return result[0];
    	
    }
    
    public void kSmallEle(Node root,int k,int[] count , int[] result)
    {
    	if(root==null || result[0]!=-1)
    	{return;}
    	kSmallEle(root.left,k,count,result);
    	count[0]++;
    	if(count[0]==k)
    	{
    		result[0]=root.data;
    	}
    	kSmallEle(root.right,k,count,result);
    	
    	
    	
    	
    }
    
    
    public Node delete(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
           
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

         
            root.data = minVal(root.right);

            root.right = delete(root.right, root.data);
        }
        
        return root; 
    }

}

public class task1 {
    public static void main(String args[]) {
        Tree t = new Tree();
        
        t.insert(15);
        t.insert(16);
        t.insert(14);
        t.insert(1);
        t.insert(4);
        t.insert(17);
        t.insert(20);

        System.out.println("PreOrder Traversal:");
        t.preOrder(t.root);
        
        System.out.println("\nSearch Results:");
        System.out.println("Search 17: " + t.search(17));
        System.out.println("Search 10: " + t.search(10));
        
        System.out.println("min val "+t.minVal(t.root));
        System.out.println("max val "+t.maxVal(t.root));
        
        System.out.println(t.isValid(t.root, null, null));
        
        System.out.println(t.KthSmall(t.root, 3));
        
        t.delete(t.root, 15);
        System.out.println("after delete 15");
        t.preOrder(t.root);
        
        
    }
}
