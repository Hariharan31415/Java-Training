package day23;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task2 {
	static Map<Integer , Integer> map = new HashMap();
	public static int fibonacci(int i)
	{
		if(i<=1)
		{return i;}
		if(map.containsKey(i))
		{return map.get(i);}
		int res=fibonacci(i-1)+fibonacci(i-2);
		map.put(i,res);
		return res;
		
		
		
		
	}
	
	public static void main(String args[])
	{
		
		System.out.println(fibonacci(10));
		System.out.println(fibonacci(2));
		System.out.println(fibonacci(1));

	}
}
