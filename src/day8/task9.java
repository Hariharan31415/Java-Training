package day8;

import java.util.regex.*;

public class task9 {
public static void main(String args[])
{
	String ph ="865745362";
	Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
	Matcher m = p.matcher(ph);
	
	if(m.find()&& m.group().equals(ph))
	{
		System.out.println("valid");
	}
	else {
		System.out.println("invalid");
	}
	
}
}
