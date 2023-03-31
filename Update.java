package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
   //To establish connection with mysql details
   static final String DB_URL = "jdbc:mysql://localhost/javatask";
   static final String USER = "root";
   static final String PASS = "Sathish@2000";
   static final String QUERY = "SELECT id, first, last, age FROM Registration";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement statement = conn.createStatement();
      ) {		      
         String query = "UPDATE Registration " +
            "SET age = 30 WHERE id in (100, 101)";
         statement.executeUpdate(query);
         ResultSet resultQuery = statement.executeQuery(QUERY);
         while(rs.next()){
            //Display values in the table after updating
            System.out.print("ID: " + resultQuery.getInt("id"));
            System.out.print(", Age: " + resultQuery.getInt("age"));
            System.out.print(", First: " + resultQuery.getString("first"));
            System.out.println(", Last: " + resultQuery.getString("last"));
         }
         resultQuery.close();
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
