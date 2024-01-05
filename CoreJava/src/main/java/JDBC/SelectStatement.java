package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class SelectStatement {

	public static void main(String[] args) throws Exception {
		
		String s = "Select * From emp";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc", "root", "root");
	
		java.sql.Statement stmt = conn.createStatement();
		
		ResultSet set = stmt.executeQuery(s);
 
		while (set.next()) {
			
			System.out.println(set.getInt("id"));
			System.out.println(set.getString("name"));
		}
	}
} 
