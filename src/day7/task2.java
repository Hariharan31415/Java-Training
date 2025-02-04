package day7;

import java.util.Stack;

public class task2 {
public static void main(String args[])
{
	Stack s = new Stack();
	
	for(int i=0;i<10;i++)
	{
		s.push(i);                     // offset --> starting from 1 at top of the stack
	}                                   //  index --> starting from zero at bottom
	

    s.pop();
	System.out.println(s);
	System.out.println(s.peek());

	
	System.out.println(s.search(s));
	
    
}
}
