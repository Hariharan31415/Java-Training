package day3;
interface Paymant
{
	int a =10;
	default void funt()
	{
		System.out.println("this is an interface function");
	}
	static void test1()
	{
		System.out.println("static method from interface");
	}
	
}
class Emp
{
	int id;
	String name,role;
	float sal;
	static void test()
	{
		System.out.println("static method from employee");
	}
	
	public Emp(int id,String name,String role,Float sal)
	{
		this.id=id;
		this.name=name;
		this.role=role;
		this.sal=sal;
		
	}
	
	void display()
	{
		System.out.println(this.id+" "+this.name+" "+this.role+" "+this.sal);
	}
	/*void calpay()
	{
		this.sal=this.sal+(this.sal*0.05f);
	}*/
	
	
	
}
class Develop1 extends Emp implements Payment{
	 public Develop1 (int id, String name, String role, Float sal) {

		 super(id, name, role, sal);

		 }
	 void calculatePay() {
		 this.sal=this.sal+1000;
	 }

	
}
class Hr extends Emp implements Payment{
	public Hr(int id, String name, String role, Float sal) {

		 super(id, name, role, sal);

		 }
	void calculatePay() {
		 this.sal=this.sal+2000;
	 }
}
class Accountant extends Emp implements Payment{
	public Accountant(int id, String name, String roll, Float sal) {

		 super(id, name, roll, sal);

		 }
	void calculatePay() {
		 this.sal=this.sal+3000;
	 }
} 

public class TASK5 {

	public static void main(String args[])
	{
		Develop1 emp1  =new Develop1(55,"hari","Developer",90000.0f);
		Hr emp2 = new Hr(66,"kumar","Hr",100000.0f);
		Accountant emp3 = new Accountant(77,"manoj", "Accountant",70000.0f);
		
		emp1.display();
		System.out.println(emp1.sal);
		Payment.test1();
		
		
	}
	
}
