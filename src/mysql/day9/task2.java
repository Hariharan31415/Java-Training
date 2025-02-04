package day9;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class task2 {
public static void main(String args[])
{
	int n,i;
	Scanner s = new Scanner(System.in);
	Connection con;
	Statement st;
	ResultSet rs;
	int id = 0,age;
	String name,designation;
	float salary;
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");}
	catch(Exception e)
	{
		System.out.println(e);
	}
	//DriverManager
	do{
		System.out.println("1.create\n2.Add\n3.modify\n4.Display\n5.Delete\n6.Exit\n");
		System.out.println("enter your option:\n");
		n = s.nextInt();	
		switch(n)
		{
		case 1:
			System.out.println("creation\n");
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3309/employee","root","dbms");
				st = con.createStatement();
				st.executeUpdate("create table fresher(id int, name varchar(25), age int, salary float(25), designation varchar(25))");
				System.out.println("table created.");
				st.close();
				con.close();
			}
			catch(Exception e)
			{
				System.out.println("error-->creation : "+e);
			}
			break;
			
		case 2:	
			System.out.println("Add\n");
			System.out.println("enter Id :");
			id = s.nextInt();
			System.out.println("enter Name :");
			//s.next();
			name=s.next();
			System.out.println("enter Age :");
			age = s.nextInt();
			System.out.println("enter Salary :");
			salary = s.nextFloat();
			System.out.println("enter Designation :");
			designation = s.next();
			
            try {
            	con = DriverManager.getConnection("jdbc:mysql://localhost:3309/employee","root","dbms");
            	st=con.createStatement();
            	i=st.executeUpdate("insert into fresher values(" + id + " , '" + name + "'," + age + "," + salary + ",'" + designation + "')");
            	System.out.println("******query updated******"); 
            	st.close();
            	con.close();
            	
			}
			catch(Exception e)
			{
				System.out.println("error-->add : " +e);
			}
			break;
			
		case 3:
			System.out.println("Modify\n");
			System.out.println("enter Id :");
			id = s.nextInt();
			System.out.println("enter Age :");
			age = s.nextInt();
			System.out.println("enter Salary :");
			salary = s.nextFloat();
            try {
            	 con = DriverManager.getConnection("jdbc:mysql://localhost:3309/employee","root","dbms");
            	 st=con.createStatement();
            	 i=st.executeUpdate("update fresher set age = '" + age + "' , salary = '"+salary+"' where id='"+id+"'");
            	 if(i==1)
            	 {
            		 System.out.println("*****record modified****");
            	 }
            	 st.close();
            	 con.close();
            	 
			}
			catch(Exception e)
			{
				System.out.println("error-->modify : "+e);
			}
			break;
			
		case 4:	
			System.out.println("Display\n");
            try {
            	con = DriverManager.getConnection("jdbc:mysql://localhost:3309/employee","root","dbms");
            	st=con.createStatement();
            	rs=st.executeQuery("select * from fresher");
            	int j=1;
            	while(rs.next())
            	{
            		System.out.println("**record**"+"-->"+ j);
            		System.out.println("Emp_Number"+"-->"+ rs.getInt(1));
            		System.out.println("Emp_Name"+"-->"+ rs.getString(2));
            		System.out.println("Emp_Age"+"-->"+ rs.getInt(3));
            		j++;
            		
            	}
			}
			catch(Exception e)
			{
				System.out.println("error-->disply : "+e);
			}
			break;
			
		case 5:
			System.out.println("Delete\n");
			System.out.println("enter Id :");
			id = s.nextInt();
            try {
            	 con = DriverManager.getConnection("jdbc:mysql://localhost:3309/employee","root","dbms");
            	 st= con.createStatement();
            	 i=st.executeUpdate("delete from fresher where id = '"+id+"' ");
			}
			catch(Exception e)
			{
				System.out.println("error-->delete : "+e);
			}
			break;
			
		case 6:	
			System.out.println("Exit\n");
            try {
            	con = DriverManager.getConnection("jdbc:mysql://localhost:3309/employee","root","dbms");
            	st=con.createStatement();
			}
			catch(Exception e)
			{
				System.out.println("error-->exit : "+e);
			}
			break;
			
		default:
			System.out.println("invalid choice");
		}
	}while(n!=6); 
}
}
