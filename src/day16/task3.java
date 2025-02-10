package day16;

class Node1 {
    int data;
    Node1 next;

    public Node1(int data) {
        this.data = data;
        this.next = null;
    }
}


class StackLinkedList {
    private Node1 top; 

    public StackLinkedList() {
        this.top = null;
    }

   
    public void push(int data) {
        Node1 newNode = new Node1(data);
        newNode.next = top; 
        top = newNode; 
        System.out.println(data + " pushed to stack");
    }

   
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! No elements to pop.");
            return -1;
        }
        int poppedData = top.data;
        top = top.next; 
        return poppedData;
    }

   
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return top.data;
    }

  
    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        Node1 temp = top;
        System.out.print("Stack elements: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}


public class task3 {
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        stack.display(); 
        
        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        stack.display();
    }
}
