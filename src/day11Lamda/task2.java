package day11Lamda;


interface A{
	int operation(int a , int b);
}

public class task2{ 
public static void main()
{
     A sum = (a,b)->{
    	 System.out.println(a+b);
    	 System.out.println(a*b);
		return a;
     };
     	
     sum.operation(5,5);
}
}