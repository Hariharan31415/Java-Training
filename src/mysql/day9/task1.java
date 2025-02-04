package day9;	
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class task1 {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3309/employee", "root", "dbms");
			if (con != null) {
				System.out.println("connected");
			} else {
				System.out.println("not connected");
			}
		}
	}



