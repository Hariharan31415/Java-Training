package day2;

class Emp{
	
	private int empid;
	String name;
	float sal;
	public Emp(int empid,String name,float sal)
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
	public int getEmpId() {                             /* use the empid in main functionwe are putting the public method
	
	                                                      --> through this we access the private empid in main function
	                                                          */
		return this.empid;
	}
	
	public void setEmpId(int empid)
	{
		this.empid=empid;
		
	}
	
} 

public class task5 {

	public static void main(String args[])
	{
		Emp emp1 = new Emp(55,"hari",13000); 
		emp1.setEmpId(57);                  //cal the setEmpId with 57 
		System.out.println(emp1.getEmpId());// get the public empid to using the public getempId method
		

	}
}
