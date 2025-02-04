package day8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task8 {
public static void main(String args[])
{
	int c=0;
	Pattern p = Pattern.compile("(0|9)?(0-9)(9)");
	Matcher m = p.matcher("9842031415");
	while(m.find())
	{
		c++;
		System.out.println(m.start()+ "--> " +  m.end()+"-->"+m.group());
		
	}
	System.out.println(c);
} 
}

// 9842031415 --> "(0|9)?(0-9)(9)"
// 919842567895 --> "(0|91)?(6-7)?(0-9)(9)"
//
