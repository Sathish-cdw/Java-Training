package jdbcConnection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTable {
   static final String DB_URL = "jdbc:mysql://localhost/javatask";
   static final String USER = "root";
   static final String PASS = "Sathish@2000";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         String query = "DROP TABLE REGISTRATION";
         stmt.executeUpdate(query);
         System.out.println("Table deleted in given database...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
