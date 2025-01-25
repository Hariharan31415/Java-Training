package day2;

//           ACCESS SPECIFIER

class second
{
	public int num1=10;
	private int num2=11;
	protected int num3=199;
	public int access()
	{
		return num2;
	}
   
}

public class task6 {
	public static void main(String args[])
	{
		task6 t = new task6();
		second s = new second();
		//System.out.println(t.num1); num1 cannot be resolved or is not a field --> num1 is public but can't acess by the outter class
		System.out.println(s.num1);
		//System.out.println(second.num1);  --> num1 not a static
		//System.out.println(s.num2); --private
		//System.out.println(s.access()); --> create a public methos in inside the second class to access the private variable
		System.out.println(s.num3);
	
	
	}

}

