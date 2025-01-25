package day3;
class Employe
{
	
 int empid;
 String name,company="info";
 float sal;
 
 
 public Employe()
 {
 System.out.println("employee constructor");		 

 }
 
 public Employe(int empid , String name, float sal)
 {
	 this.empid=empid;
	 this.name=name;
	 this.sal=sal;
	 System.out.println("emp parameter");
	 }
 void display()
 {
	 System.out.println(this.empid);
	 System.out.println(this.name);
	 System.out.println(this.sal);
 }

 
}

class Develop extends Employe{
	
	String lang = "string";
	String des="developer"+super.company;
	
	public Develop(int empid,String name,float sal)
	{
		super(empid,name,sal);
		this.lang=lang;
		
		System.out.println("developer constructor");
	}
	void calpay()
	{
		this.sal=this.sal+1500;
	}
	
	void display()
	{
		super.display();
		System.out.println(des);
	}
		
}


public class task2 {
public static void main(String args[])

{
	 Employe emp = new Employe(12,"hari",12000);
	 Develop dev = new Develop(13,"haran",13000);
	 System.out.println(dev.name);
	 emp.display();
	 dev.display();
	 
}
}
