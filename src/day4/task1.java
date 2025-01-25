package day4;
import java.util.Scanner;

public class task1 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
         int avi5,avi1,amt,no5=0,no1=0;
         avi5=s.nextInt();
         avi1=s.nextInt();
         amt=s.nextInt();
         if(amt>=5)
         {
        	 no5=amt/5;
        	 if(no5>avi5)
        		  no5=avi5;
        	 amt-=(no5*5);
         }
         if(amt>=1)
         {
        	 no1=amt/1;
        	 if(no1>avi1)
        		  no1=avi1;
        	 amt-=(no1*1);
         }
         if(amt>0)
         {
        	 System.out.println("amount is greater than avilable amount-1");
         }
         else {
        	 System.out.println("no of five "+no5);
        	 System.out.println("no of 1 "+no1);
         }
         
	}
	}
