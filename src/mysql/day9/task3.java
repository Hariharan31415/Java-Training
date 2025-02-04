package day9;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class task3 {
    public static void main(String args[]) {
        int n, i;
        Scanner s = new Scanner(System.in);
        Connection con;
        Statement st;
        ResultSet rs;
        int userId = 0;
        String name, paymentMethod, rechargePlan,phoneNumber;
        float amount;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e);
        }

        do {
            System.out.println("1.Create Tables\n2.Add User\n3.Modify User\n4.Display Transactions\n5.Delete Expired Plan\n6.Exit\n");
            System.out.println("Enter your option:\n");
            n = s.nextInt();
            
            switch (n) {
                case 1:
                    System.out.println("Creating Tables\n");
                    try {
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3309/recharge_db", "root", "dbms");
                        st = con.createStatement();
                        st.executeUpdate("create table user(userId int, name varchar(25), phoneNumber varchar(20), paymentMethod varchar(25))");
        				 System.out.println("Tables created.");
                        st.close();
                        con.close();
                    } catch (Exception e) {
                        System.out.println("Error--> Table Creation : " + e);
                    }
                    break;

                case 2:
                    System.out.println("Add User\n");
                    System.out.println("Enter User ID:");
                    userId = s.nextInt();
                    System.out.println("Enter Name:");
                    name = s.next();
                    System.out.println("Enter Phone Number:");
                    phoneNumber = s.next();
                    System.out.println("Enter Payment Method:");
                    paymentMethod = s.next();

                    try {
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3309/recharge_db", "root", "dbms");
                        st = con.createStatement();
                        i = st.executeUpdate("insert into user values(" + userId + ", '" + name + "', " + phoneNumber + ", '" + paymentMethod + "')");
                        System.out.println("***User Added***");
                        st.close();
                        con.close();
                    } catch (Exception e) {
                        System.out.println("Error--> Add User : " + e);
                    }
                    break;

                case 3:
                    System.out.println("Modify User\n");
                    System.out.println("Enter User ID:");
                    userId = s.nextInt();
                    System.out.println("Enter New Phone Number:");
                    phoneNumber = s.next();
                    System.out.println("Enter New Payment Method:");
                    paymentMethod = s.next();

                    try {
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3309/recharge_db", "root", "dbms");
                        st = con.createStatement();
                        i = st.executeUpdate("UPDATE users SET phoneNumber = " + phoneNumber + ", paymentMethod = '" + paymentMethod + "' WHERE userId = " + userId);
                        if (i == 1) {
                            System.out.println("**User Details Modified*");
                        }
                        st.close();
                        con.close();
                    } catch (Exception e) {
                        System.out.println("Error--> Modify User : " + e);
                    }
                    break;

                case 4:
                    System.out.println("Display Transactions\n");
                    try {
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3309/recharge_db", "root", "dbms");
                        st = con.createStatement();
                        rs = st.executeQuery("SELECT * FROM transactions");

                        int j = 1;
                        while (rs.next()) {
                            System.out.println("*Transaction Record " + j + " *");
                            System.out.println("Transaction ID: " + rs.getInt(1));
                            System.out.println("User ID: " + rs.getInt(2));
                            System.out.println("Recharge Plan: " + rs.getString(3));
                            System.out.println("Amount: " + rs.getFloat(4));
                            j++;
                        }
                    } catch (Exception e) {
                        System.out.println("Error--> Display Transactions : " + e);
                    }
                    break;

                case 5:
                    System.out.println("Delete Expired Plan\n");
                    System.out.println("Enter Transaction ID:");
                    int transactionId = s.nextInt();
                    try {
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3309/recharge_db", "root", "dbms");
                        st = con.createStatement();
                        i = st.executeUpdate("DELETE FROM transactions WHERE transactionId = " + transactionId);
                        if (i == 1) {
                            System.out.println("**Expired Plan Deleted*");
                        }
                        st.close();
                        con.close();
                    } catch (Exception e) {
                        System.out.println("Error--> Delete Expired Plan : " + e);
                    }
                    break;

                case 6:
                    System.out.println("Exit\n");
                    try {
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3309/recharge_db", "root", "dbms");
                        st = con.createStatement();
                    } catch (Exception e) {
                        System.out.println("Error--> Exit : " + e);
                    }
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } while (n != 6);
    }
}