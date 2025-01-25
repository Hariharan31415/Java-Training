package day2;


class Employeee
{
	
 int empid;
 String name;
 float sal;
 public Employeee() {
	 
	 System.out.println("default constructor");
 } 
 public Employeee(int empid,String name,float sal)
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

class Developer extends Employeee{
	
	public Developer()
	{
		System.out.println("developer obj is created");
	}
		
}


public class task9 {
public static void main(String args[])

{
	 
       Developer dev = new Developer();

}
}
