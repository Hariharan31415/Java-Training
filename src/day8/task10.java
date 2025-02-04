package day8;

import java.util.regex.*;

public class task10 {
public static void main(String args[])
{
	String ph ="hari@gmail.com";
	Pattern p = Pattern.compile("[@gmail.com]");
	Matcher m = p.matcher(ph);
	while(m.find()) {
		
	System.out.println(m.start()+" "+m.group());
	
	}
	
	
}
}
