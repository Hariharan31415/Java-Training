package day3;


class Employeee
{
	
 int empid;
 String name;
 float sal;
  
 public Employeee()
 {
	 this.empid=empid;
	 this.name=name;
	 this.sal=sal;
	 
	 System.out.println("employee constructor");		 
 }
 void display()
 {
	 System.out.println(empid);
	 System.out.println(name);
	 System.out.println(sal);
 }
 void calpay()
	{
		this.sal=this.sal+1500;
	}
 
 void fun()
 {
	 System.out.println("this is parent class function ");
 }
 
 void fun(int a)
 {
	 System.out.println(a);
 }
}

class Developer extends Employeee{
	
	public Developer()
	{
		System.out.println("developer obj is created");
	}
	void calpay()
	{
		this.sal=this.sal+1500;
	}
		
}


public class task1 {
public static void main(String args[])

{
	 
       Developer dev = new Developer();
       dev.sal=5000;
       dev.calpay();
       System.out.println(dev.sal);
       dev.fun(); // the child class dontn't have the fun method so it go to the parent class method and exe that method.
       dev.fun(12); // overloading methos in the employee class

}
}
