package day2;

class first
{
	public int num1=10;
	private int num2=11;
	protected int num3=199;
	public int access()
	{
		return num2;
	}
   
}
class sec extends first{
	void display()
	{

	}
}

public class Task7 {
public static void main(String args[])
{
    first s = new first();
    sec ss = new sec();
    System.out.println(ss.num3);
    
    
}
}
