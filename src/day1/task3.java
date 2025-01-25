package javatraining055;

class Employee1{
	
	int empid;
	String name;
	float sal;
	public Employee1(int id,String name,float sal)
	{
		id=empid;
		this.name=name;
		this.sal=sal;
		
	}
	void display()
	{
		System.out.println(empid+""+name+""+sal);
	}
	
} 

public class task3 {

	public static void main(String args[])
	{
		Employee1 emp1=new Employee1(001,"hari",13000);
		Employee1 emp2=new Employee1(002,"haran",15000);
		emp1.display();

	}
}
