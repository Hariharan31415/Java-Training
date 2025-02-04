package day8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task6 {
public static void main(String args[])
{
	int c=0;
	Pattern p = Pattern.compile("a+");
	Matcher m = p.matcher("abababaaab");
	while(m.find())
	{
		c++;
		System.out.println(m.start()+ "--> " +  m.end()+"-->"+m.group());
		
	}
	System.out.println(c);
} 
}


