package Enumer;

interface actionTaken{
	
	
}
enum Traffic1 implements actionTaken{
	
	RED
	{ 
		public String action()
		{return "stop";}
	}, 
	GREEN
	{
		public String action()
		{return "go";}
	}, 
	YELLOW
	{ 
		public String action()
		{return "ready";}
	} ;
	
}
public class task3 {
public static void main(String args[])
{
	for(Traffic1 light:Traffic1.values())
	{
		System.out.println(light +":"+light.action());
	}

}
}
