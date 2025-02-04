package day11;


interface Add{
	int sum(int a , int b);
}

public class task1{ 
public static void main()
{
     Add addnum = (a,b)-> a + b;	
     Add multiple = (a,b)-> a * b;
     System.out.println(addnum.sum(100, 10));
     System.out.println(multiple.sum(100, 10));
     
}
}