package day4;
import java.util.Scanner;


class Stock
{
	static int stockvalue=10;
	public static void upStock(int order)
	{
		try {
			if(stockvalue<3)
			{
				throw new ArithmeticException();
			}
		}
		catch(ArithmeticException e){
			System.out.println("please restock the inventry ");
		}
		if(order>stockvalue)
		{
			System.out.println("out of stock");
		}
	}
}

public class task6 {
public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("order");
	int order=s.nextInt();
	Stock st = new Stock();
	Stock.upStock(order);
}

}
