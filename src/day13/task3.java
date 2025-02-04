package day13;

import java.util.*;
class StackArray1 {
    String arr[];
    int top =-1, MAX;

    public StackArray1(int MAX) {
  
        this.MAX = MAX;
        this.arr = new String[MAX]; 
    }

    void push(String str) {
        if (overflow()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = str; 
        System.out.println("Pushed: " + str);
    }

    String pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return null; 
        }
        return arr[top--]; 
    }
    
    String peek()
    {
    	if(isEmpty())
    	{
    		System.out.println("stack Empty");
    	}
    	else {
    		return arr[top];
    	}
		return null;
    }

    boolean overflow() {
        return top >= MAX - 1; 
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class task3 {
public static void main(String args[])
{
	
	Scanner s = new Scanner(System.in);
	String[] str = s.nextLine().split(" ");
	int MAX =str.length;
    StackArray1 stack = new StackArray1(MAX);
    for(int i=0;i<MAX;i++)
    {
    	
    	if(str[i].equals("(") || str[i].equals("[") || str[i].equals("{"))
    	{

    		stack.push(str[i]);
    		continue;
    	}
    	if(!stack.isEmpty()) {
    		System.out.println("inside empty"+stack.peek() + " "+str[i]);
    		String topElement = stack.peek();
	    	if( (str[i].equals(")") && topElement.equals("(")) ||         
	    			(str[i].equals("]") && topElement.equals("[")) ||
	                   (str[i].equals("}") && topElement.equals("{")))
	    	{
	    		stack.pop();
	    
	    	}
    	}
    	/*
    	if(str[i]==")"  && stack.peek().equals(str[i]))
    	{
    		stack.pop();
    
    	}
    	if(str[i]=="}"  && stack.peek().equals(str[i]))
    	{
    		stack.pop();
    
    	}
    	if(str[i]=="]"  && stack.peek().equals(str[i]))
    	{
    		stack.pop();
    
    	}
	*/
    }
    
    if(stack.isEmpty())
    {
    	System.out.println("balanced");
    }
    else {
    	System.out.println("unblanced.");
    }
}
}
