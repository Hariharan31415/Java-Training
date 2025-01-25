package day3;

public class task6 {
public static void main(String args[])
{
	 int sum=0,x=8,re,i,j,ans=0;
     for(i=1;i<=x;i++)
     {
         ans = x-i;
         if(ans<i)
         {
             sum=ans;
         }
         ans=ans-(++i);
     }
 System.out.println(sum);
}
}