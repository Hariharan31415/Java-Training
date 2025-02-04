package day13;
import java.util.*;
class StackArray {
    int arr[], top, MAX;

    public StackArray(int MAX) {
        this.top = -1;
        this.MAX = MAX;
        this.arr = new int[MAX]; 
    }

    void push(int val) {
        if (overflow()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = val; 
        System.out.println("Pushed: " + val);
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1; 
        }
        return arr[top--]; 
    }
    void peek()
    {
    	if(isEmpty())
    	{
    		System.out.println("stack Empty");
    	}
    	else {
    		System.out.println("peek element :"+ arr[top]);
    	}
    }

    boolean overflow() {
        return top >= MAX - 1; 
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class task2 {
    public static void main(String args[]) {
    	Scanner s = new Scanner(System.in);
        int i=1, MAX = 5;
        StackArray stack = new StackArray(MAX);

        while(i<=MAX)
        {
        	stack.push(s.nextInt());
        	i++;
        }
        stack.push(60);  // over flow 

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
      
        stack.peek(); // top element 
        System.out.println("stack empty :"+stack.isEmpty());
        
    }
}
