package day2;

class Employee{
	
	int empid;
	String name;
	float sal;
	public Employee(int empid,String name,float sal)
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
	
} 

public class task1 {

	public static void main(String args[])
	{
		Employee emp1 = new Employee(001,"hari",13000); 
		emp1.display();

	}
}
