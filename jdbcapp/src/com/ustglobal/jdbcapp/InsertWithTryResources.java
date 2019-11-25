package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class InsertWithTryResources {
	public static void main(String[] args) {
		try(FileReader reader = new FileReader("db.properties")){
			Properties prop = new Properties();
			prop.load(reader);
			
			Class.forName(prop.getProperty("driver-class-name"));
			String url =prop.getProperty("url");
			String sql =prop.getProperty("insert-query");
			try(Connection conn=DriverManager.getConnection(url,prop);
				//Statement stmt =conn.createStatement();
					PreparedStatement	pstmt = conn.prepareStatement(sql)){
					String empid = args[0];
					int id = Integer.parseInt(empid);
					pstmt.setInt(1, id);
					String empname  = args[1];
					pstmt.setString(2, empname);
					String empsal = args[2];
					int sal = Integer.parseInt(empsal);
					pstmt.setInt(3, sal);
					String empgender  = args[3];
					pstmt.setString(4, empgender);
					int count =pstmt.executeUpdate();
				//ResultSet rs =pstmt.executeQuery(sql)){
//					while(count.next()) {
//						System.out.println("Id: "+rs.getInt("id"));
//						System.out.println("Name: "+rs.getString("name"));
//						System.out.println("Salary: "+rs.getInt("sal"));
//						System.out.println("Gender: "+rs.getString("gender"));
//					}
				//}
				
		}
					
			
		}catch(Exception e) {
			
		}
	}

}
