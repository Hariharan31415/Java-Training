package DAY12;

import java.util.Arrays;
import java.util.Scanner;

enum Traffic1{
	RED,GREEN,YELLOW	
}

public class task5 {
public static void main(String args[])
{
   Scanner s = new Scanner(System.in);
   String str = s.next().toUpperCase();
   switch(str)
   {
   case "RED" :
	   System.out.println("stop");
	   break;
	   
   case "GREEN":
	   System.out.println("go");
	   break;
	   
   case "YELLOW":
	   System.out.println("ready");
	   break;
	   
   default :
	System.out.println("invalid");
	   break;
   
   }
   
}
}
