package day10;
import java.sql.*;
import java.util.Scanner;

public class task2 {
    static Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3309/userlogin", "root", "dbms");
            return con;
        } catch (Exception e) {
            System.out.println("Connection error: " + e);
        }
        return null;
    }

    static void CreateTable() {
        Connection con = connect();
        if (con == null) return;
        
        String query = "CREATE TABLE users(id INT, username VARCHAR(30), password VARCHAR(30))";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.executeUpdate();
            System.out.println("Table created.");
        } catch (SQLException e) {
            System.out.println(e);
        } 
      }
    

    static boolean authenticateUser(Connection con, String username, String password) {
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        try {
        	PreparedStatement pstmt = con.prepareStatement(sql); 
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    static boolean updatePassword(Connection con, String username, String newPassword) {
        String sql = "UPDATE users SET password = ? WHERE username = ?";
        try {
        	PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, newPassword);
            pstmt.setString(2, username);
            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println (e);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CreateTable(); 
        System.out.print("Enter username: ");
        String username = s.next();
        System.out.print("Enter password: ");
        String password = s.next();
        Connection con = connect();
        if (con == null) {
            System.out.println("failed...");
            return;
        }
        if (authenticateUser(con, username, password)) {
            System.out.println("Login successful! Welcome " + username);
        } else {
            System.out.println("Incorrect password. Please reset your password.");
            System.out.print("Enter new password: ");
            String newPassword = s.next();
            System.out.print("Confirm new password: ");
            String confirmPassword = s.next();

            if (newPassword.equals(confirmPassword)) {
                if (updatePassword(con, username, newPassword)) {
                    System.out.println("Password reset successfully. Please log in again.");
                    System.out.print("Enter username: ");
                    username = s.next();
                    System.out.print("Enter password: ");
                    password = s.next();

                    if (authenticateUser(con, username, password)) {
                        System.out.println("Login successful! Welcome " + username);
                    } else {
                        System.out.println("Login failed. Exiting...");
                    }
                } else {
                    System.out.println("User not found. Exiting...");
                }
            } else {
                System.out.println("Passwords do not match. Exiting...");
            }
        }

        try { 
        	con.close(); 
        	} 
        catch (SQLException e) {
        	System.out.println(e);
        }
        s.close();
    }
}
