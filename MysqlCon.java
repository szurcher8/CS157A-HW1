import java.sql.*;

public class MysqlCon {

   public static void main(String[] args) {
      try {
         Class.forName("com.mysql.jdbc.Driver");
         
         // Here, cs157a is the database name, root is the username, and Something0clever. is the password.
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cs157a", "root", "Something0clever.");
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery("select * from emp");
         
         while(rs.next())
         System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
         con.close();
      } 
      catch (Exception e) {
         System.out.println(e);
      }
   }

} // This will fetch all the records of the emp table.
