package day19;

import day20.Node1;

public class task2 {

	
	
	
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



public Node1 delete(Node1 root, int key) {
    if (root == null) {
        return root;
    }

    // Recursive deletion
    if (key < root.data) {
        root.left = delete(root.left, key);
    } else if (key > root.data) {
        root.right = delete(root.right, key);
    } else {
        // Node to be deleted found

        // Case 1: Node with only one child or no child
        if (root.left == null) {
            return root.right;
        } else if (root.right == null) {
            return root.left;
        }

        // Case 2: Node with two children, get the inorder successor (smallest in right subtree)
        Node1 temp = findMinValueNode(root.right);
        root.data = temp.data; // Copy inorder successor's value to this node
        root.right = delete(root.right, temp.data); // Delete the inorder successor
    }

    // Update height
    root.height = Math.max(height(root.left), height(root.right)) + 1;

    // Get balance factor
    int balance = getBalance(root);

    // Balancing the tree

    // Left Heavy (Right Rotation)
    if (balance > 1 && getBalance(root.left) >= 0) {
        return rightRotate(root);
    }

    // Left-Right Case (Left Rotate on Left Child, then Right Rotate)
    if (balance > 1 && getBalance(root.left) < 0) {
        root.left = leftRotate(root.left);
        return rightRotate(root);
    }

    // Right Heavy (Left Rotation)
    if (balance < -1 && getBalance(root.right) <= 0) {
        return leftRotate(root);
    }

    // Right-Left Case (Right Rotate on Right Child, then Left Rotate)
    if (balance < -1 && getBalance(root.right) > 0) {
        root.right = rightRotate(root.right);
        return leftRotate(root);
    }

    return root;
}