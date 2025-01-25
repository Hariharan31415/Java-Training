package day4;

public class task2 {

	public static void main(String args[]) {
		int a=10;
		System.out.println("before error");
		System.out.println();
		try {
		int b=a/0;
		System.out.println("after error");
		
		}
		catch(ArithmeticException e){
			System.out.println("please provide the valid number not 0");
		}
		System.out.println("after error");
		
	}
}





