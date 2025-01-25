package day2;

public class task10 {
public static void main(String args[])
{
   int n=2345,re,am,n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
   while(n>0) {
   if(n>=2000)
   {
	   n1=n/2000;
	   am=2000-n;
   }
   if(n>=500)
   {
	   n2=n/500;
	   am=500-n;
   }
   if(n>=200)
   {
	   n3=n/200;
	   am=200-n;
   }
   if(n>=100)
   {
	   n4=n/100;
	   am=100-n;
   }
   if(n>=50)
   {
	   n5=n/50;
	   am=50-n;
   }
   if(n>=20)
   {
	   n6=n/20;
	   am=20-n;
   }
   if(n>=10)
   {
	   n7=n/10;
	   am=10-n;
   }
   if(n>=5)
   {
	   n8=n/5;
	   am=5-n;
   }
   if(n>=2)
   {
	   n9=n/2;
	   am=2-n;
   }
   if(n>=1)
   {
	   n10=n/1;
	   am=1-n;
   }
   
}
System.out.println("2000-->"+n1+"\n"+"500-->"+n2+"\n"+"200-->"+n3+"\n"+"100-->"+n4+"\n"+"50-->"+n5+"\n"+"20-->"+n6+"\n"+"10-->"+n6+"\n"+"5-->"+n7+"\n"+"2-->"+n8+"\n"+"1-->"+n9+"\n");
   
}
}
