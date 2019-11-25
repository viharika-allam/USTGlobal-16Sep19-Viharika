package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class ExecuteDeleteQueryWithProperties {
	public static void main(String[] args) {
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		try {
			//Step 1 Load Driver
			//Driver driver = new Driver();
			//DriverManager.registerDriver(driver);
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driver-class-name"));
			//Step 2 Get the Connection
			
			String url =prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);
			
			//Step 3 Issue SQL query
			//String sql ="delete from employee_info where id=? ";
			//stmt =conn.createStatement();
			String sql =prop.getProperty("delete-query");
			//rs=stmt.executeQuery(sql);
					
			pstmt =conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			//pstmt.setInt(1,Integer.parseInt(args[0]));
			int count = pstmt.executeUpdate();
			
			//Step 4 Read the Result
			System.out.println(count + "Row(s) deleted");
					
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		//Step 5 Close all JDBC Objects
		try {
			if(conn!=null) {
				conn.close();
			}
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
		
	}

	}


