package day18;

public class task5 {
   public static long pow(long base , long expon)
	{
		if(expon==0)
		{
			return 1;
		}
		long temp = pow(base,expon/2);
		if(expon%2==0)
		{
			System.out.println(temp + "*" + temp);
			return temp*temp;}
		else {
			System.out.println(base + "*" + temp + "*" + temp);
			return base * temp * temp;}
		
		
	}
public static void main(String args[])
{
	int base=3 , expon=13;
    System.out.println(pow(base,expon));

}
}
