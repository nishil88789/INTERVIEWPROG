 package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Prepared {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc", "root", "root");
	
  PreparedStatement ps = conn.prepareStatement("Insert into emp (id,name)  values(?,?)");
  
      ps.setInt(1,7);
     ps.setString(2, "Nikil");

     int a = ps.executeUpdate();
     
     System.out.println(a);
	} 
	
}
