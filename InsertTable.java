package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTable {

   static final String DB_URL = "jdbc:mysql://localhost/javatask";
   static final String USER = "root";
   static final String PASS = "Sathish@2000";

   public static void main(String[] args) {
      // Open a connection	
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {	
         // Execute a query to insert into tables
         System.out.println("Inserting records into the table...");          
         String query = "INSERT INTO Registration VALUES (100, 'Zara', 'Ali', 18)";
         stmt.executeUpdate(query);
         query = "INSERT INTO Registration VALUES (101, 'Mahnaz', 'Fatma', 25)";
         stmt.executeUpdate(query);
         query = "INSERT INTO Registration VALUES (102, 'Zaid', 'Khan', 30)";
         stmt.executeUpdate(query);
         query = "INSERT INTO Registration VALUES(103, 'Sumit', 'Mittal', 28)";
         stmt.executeUpdate(query);
         System.out.println("Inserted records into the table..."); 
      
   catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
