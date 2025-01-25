package day3;
class Employee
{
	
 int empid;
 String name,company="info";
 float sal;
 
 
 public Employee()
 {
 System.out.println("employee constructor");		 

 }
 
 public Employee(int empid , String name, float sal)
 {
	 this.empid=empid;
	 this.name=name;
	 this.sal=sal;
	 System.out.println("emp parameter");
	}
 
 @override
 public void String toString()
 {
	  return empid+" "+name;
 }

 
}




public class task3 {
public static void main(String args[])

{
	 Employee emp = new Employee(12,"hari",12000);
	 System.out.println(emp);
}
}
