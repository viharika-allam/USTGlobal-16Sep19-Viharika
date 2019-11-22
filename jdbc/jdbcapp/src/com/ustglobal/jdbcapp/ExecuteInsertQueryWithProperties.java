package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQueryWithProperties {
	public static void main(String[] args) {
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			
			//Step 1 Load Driver
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			
			Class.forName(prop.getProperty("driver-class-name"));
			//Step 2 Get the Connection
			String url =prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);
			
			//Step 3 Issue SQL query
			String sql =prop.getProperty("insert-query");
					
					
			//stmt =conn.createStatement();
					pstmt = conn.prepareStatement(sql);
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
			
			//int count = stmt.executeUpdate(sql);
			
			//Step 4 Read the Result
			System.out.println(count + "Row(s) inserted");
					
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		//Step 5 Close all JDBC Objects
		try {
			if(conn!=null) {
				conn.close();
			}
//			if(stmt!=null) {
//				stmt.close();
//			}
			if(pstmt!=null) {
				pstmt.close();
			}
			if(reader!=null) {
				reader.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		
	}//end of main()

}//end of ExecuteInsertQuery
