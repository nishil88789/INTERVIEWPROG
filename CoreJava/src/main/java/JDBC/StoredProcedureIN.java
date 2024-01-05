package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class StoredProcedureIN {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc", "root", "root"); 
	
	CallableStatement call = conn.prepareCall("{call Test1(?)}");
	
	call.setInt(1, 1);
	
	call.execute();
	
	System.out.println("Check DB");
	
	conn.close();
	}
}
