package day2;

class Employee2{
	
	int empid;
	String name;
	float sal;
	float salary;
	public Employee2(int empid,String name,float sal)
	{
		this.empid=empid;
		this.name=name;
		this.sal=sal;
		
	
	}
	void display()
	{
		System.out.println(empid);
		System.out.println(name);
		System.out.println(sal);
	
	}
	float salary()
	{
		
		this.sal=(this.sal+(this.sal*0.05f));
		return this.sal;
		
		
	}
	
} 

public class task2 {

	public static void main(String args[])
	{
		Employee2 emp1 = new Employee2(55,"hari",13000);
		
		emp1.display();
		
		
		System.out.println(emp1.salary());

	}
}
