package javatraining055;

class Employee{
	
	int empid;
	String name;
	float sal;
	
} 

public class task2 {

	public static void main(String args[])
	{
		Employee emp1=new Employee();
		Employee emp2 = new Employee();
		emp1.empid=12;
		emp1.name="hari";
		emp1.sal=12000;
		emp2.empid=13;
		emp2.name="haran";
		emp2.sal=13000;
		
	System.out.println(emp1.empid);
	System.out.println(emp1.name);
	System.out.println(emp1.sal);
	System.out.println(emp2.empid);
	System.out.println(emp2.name);
	System.out.println(emp2.sal);
	
	
	}
}
