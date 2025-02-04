package Enumer;
import java.util.*;

enum Operation1{
	ADD {
		public int apply(int x , int y) {
		return x+y;}
	},
	
	SUBTRACT {
		public int apply(int x , int y) {
		return x-y;}
	};
	
	public abstract int apply(int x , int y); 
	
}
public class task1 {
public static void main(String args[])
{
	System.out.println(Operation1.ADD.apply(2,3));
}
}
