package DAY12;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class Order{
	int id,val;
	public Order(int id,int val)
	{
		this.id=id;
		this.val=val;
	}
		
}

public class task3 {
public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	int o,v;
	System.out.println("enter size :");
	int n=s.nextInt();
	Order[] arr = new Order[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("enter Order :");
		o=s.nextInt();
		System.out.println("enter val :");
		v=s.nextInt();
		arr[i]=new Order(o,v);
	}
	
	Comparator<Order> compare = new Comparator<Order>()
	{
		public int compare(Order o1,Order o2)
		{
			return Integer.compare(o1.val, o2.val);
		}
	};
	
	Arrays.sort(arr,compare);
	
	System.out.println("enter key value :");
	int key=s.nextInt();
	
	for(int i=n-key;i<=key;i++)
	{
		System.out.println(arr[i].id+" "+arr[i].val);
	}
}
}
