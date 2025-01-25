package day2;


//constructor chaining
class Employee4{
	
	int empid;
	String name;
	float sal;
	float salary;
	String email;                                
    static int emailcount=0;
    
	public Employee4() {
		System.out.println("default constructor");
		emailcount+=1;
	}
     public Employee4(int empid,String name) {
		
		this.empid=empid;
		this.name=name;
		System.out.println("second constructor");
		// emailcount+=1; avoid chain to default const
	}
	public Employee4(int empid,String name,float sal)
	{
		this();
		this.empid=empid;
		this.name=name;
		this.sal=sal;
		
		
		// emailcount+=1; avoid chain to default const
		
	
	}
	
	
	public Employee4(String name,int empid,float sal) {              /* order change */
		
		System.out.println("third constructor");
		// emailcount+=1; avoid chain to default const
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

public class task4 {

	public static void main(String args[])
	{
		Employee4 emp1 = new Employee4(55,"hari",13000);
	
		Employee4 emp2= new Employee4(); 
		
		System.out.println(Employee4.emailcount);
		
		Employee4 emp3 = new Employee4(22,"kumar"); 
		Employee4 emp4 = new Employee4(33,"raj",1200);
		Employee4 emp5 = new Employee4("haran",'H',13000);
		emp4.display();
		emp5.display();
		System.out.println(Employee4.emailcount);
		
		
		

	}
}
