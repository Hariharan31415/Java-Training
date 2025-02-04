package day10;
import java.sql.*;
import java.util.Scanner;
public class task1 {
	static Connection connect()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3309/login","root","dbms");
		    if(con!=null)
		    {
		    	return con;
		    }
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
		
	}
	
	static void CreateTable(){
		Connection con= connect();
		String query="create table signup(id int,username varchar(30),password varchar(30))";
		try {
		PreparedStatement ps = con.prepareStatement(query);
		System.out.println(ps);
		ps.executeUpdate();
		System.out.println("table created.");
		con.close();
		ps.close();
		}catch(SQLException e) {
			System.out.println(e);
		}
		
	}
		
		
	static void InsertTable() {
		int id;
		String username,password;
		Connection con = connect();
		Scanner s = new Scanner(System.in);
		System.out.println("enter ID :");
	    id = s.nextInt();
		System.out.println("enter Name :");
		username = s.next();
		System.out.println("enter Password :");
		password = s.next();
		String query = "insert into signup (id,username,password) values(?,?,?)";
		try{
		PreparedStatement ps = con.prepareStatement(query);
	    ps.setInt(1,id);
	    ps.setString(2, username);
	    ps.setString(3, password);
	    
	    ps.executeUpdate();
	    con.close();
		ps.close();}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		
		
	}
	
	  static void DeleteTable() {
			int id;
			Connection con = connect();
			Scanner s = new Scanner(System.in);
			System.out.println("enter ID :");
		    id = s.nextInt();
			String query = "delete from signup where id = ?";
			try{
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
		    ps.executeUpdate();
		    con.close();
			ps.close();}
			catch(SQLException e)
			{
				System.out.println(e);
			}
			
	  }
	  
	  static void UpdateTable() {
		    int id;
		    String username,password;
			Connection con = connect();
			Scanner s = new Scanner(System.in);
			System.out.println("enter ID :");
		    id = s.nextInt();
			System.out.println("enter Name :");
			username = s.next();
			System.out.println("enter Password :");
			password = s.next();
			String query = "update signup set username = ?,password =? where id=id";
			try{
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setInt(3, id);
		    ps.executeUpdate();
		    con.close();
			ps.close();}
			catch(SQLException e)
			{
				System.out.println(e);
			}
			
	  }
	static void View() {
		
		Connection con = connect();
		String query="select * from signup" ;
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println("Id:"+rs.getInt(1)+"Name:"+rs.getString(2)+"Password:"+rs.getString(3));
			}
			con.close();
			ps.close();
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		
}
	
	
	
	
public static void main(String args[])
{
 int n;
 Scanner s = new Scanner(System.in);
	
	do {
	System.out.println("1.Create Tables\n2.Insert\n3.Modify\n4.Display\n5.Delete\n6.Exit\n");
    System.out.println("Enter your option:\n");
    n = s.nextInt();
    
    switch(n)
    {
    case 1:
    	CreateTable();
    	break;
    case 2:
    	InsertTable();
    	break;
    case 3:	
    	//ModifyTable();
    	break;
    case 4:	
    	View();
    	break;
    case 5:	
    	DeleteTable();
    	break;	
    case 6:	
    	System.exit(0);
    	break;	
    default:
    	System.out.println("invalid");
    
    }
    
	}while(n!=6);

}
}
