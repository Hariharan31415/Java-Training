package day7;

import java.util.Stack;
import java.util.Scanner;
public class day8 {
public static void main(String args[])
{
	Scanner ss = new Scanner(System.in);
	int n=ss.nextInt();;
	String string[]= new String[n];//{"a","b","d","e","f","a","b"};
	String sub1[]=new String[3] ;
	String sub2[]=new String[3] ;
	Stack s = new Stack();
	for(int i=0;i<n;i++)
	{
		string[i]=ss.nextLine();
	}
	for(int i=0;i<2;i++)
	{
		sub1[i]=ss.nextLine();
	}
	for(int i=0;i<2;i++)
	{
		sub2[i]=ss.nextLine();
	}

	for(int i=0;i<n;i++)
	{
		
	}
	
	
	
	
	
	
	/*
	while(i>=0)
	{
		s.push(string[i]);
		if(s.peek().equals(sub1[1]))
		{
			if(s.peek().equals(sub1[0]))
			{
				s.pop();
			}
			
		}
		if(s.peek().equals(sub2[1]))
		{
			s.push(++i);
			if(s.peek().equals(sub2[0]))
			{
				s.pop();
			}
		}
		i++;
	}
	System.out.println(s.size());
	*/
}
}
