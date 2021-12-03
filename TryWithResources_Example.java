import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class TryWithResources_Example {
   public static void main(String args[]) {
      //Getting the connection
      String mysqlUrl = "jdbc:mysql://localhost/mydatabase";
      System.out.println("Connection established......");
      //Registering the Driver
      try{
      Connection con = DriverManager.getConnection(mysqlUrl, "root", "password");
      Statement stmt = con.createStatement(); {
         try(ResultSet rs = stmt.executeQuery("select * from MyPlayers");){
            //Retrieving the data
            while(rs.next()) {
            
            }
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }} catch (SQLException e) {
            e.printStackTrace();
      }
   }
}
