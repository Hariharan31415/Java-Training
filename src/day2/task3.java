package day2;


//constructor over loading..
class Employee3{
	
	int empid;
	String name;
	float sal;
	float salary;
	public Employee3(int empid,String name,float sal)
	{
		this.empid=empid;
		this.name=name;
		this.sal=sal;
		
	
	}
	public Employee3() {
		System.out.println("default constructor");
	}
	public Employee3(int empid,float sal) {
		this.name=name;
		this.empid=empid;
		this.sal=sal;
		System.out.println("second constructor");
	}
	public Employee3(String name,int empid,float sal) {
		this.name=name;
		this.empid=empid;
		this.sal=sal;
		System.out.println("third constructor");
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

public class task3 {

	public static void main(String args[])
	{
		Employee3 emp1 = new Employee3(55,"hari",13000);
		emp1.display();
		Employee3 emp2= new Employee3(); //default constructor
		
		Employee3 emp3 = new Employee3(22,2222); //2 argu constructor
		Employee3 emp4 = new Employee3("haran",55,13000);// third const is work --> using const overloading
		Employee3 emp5 = new Employee3("haran",'H',13000);//implicit conversion --> (ch-int)
		emp4.display();
		emp5.display();
		
		
		//System.out.println(emp1.salary());

	}
}
