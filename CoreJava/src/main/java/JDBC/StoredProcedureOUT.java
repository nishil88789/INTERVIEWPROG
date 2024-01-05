package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class StoredProcedureOUT {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc", "root", "root");
	
   CallableStatement call = conn.prepareCall("{call Test2(?)}");
   
   call.setInt(1, 1);
   
   call.registerOutParameter(1, Types.INTEGER);
   
   call.execute();
   
   System.out.println(call.getInt(1));
  
   conn.close();
	}
}
