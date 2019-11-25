package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class ExecuteUpdateQueryWithProperties {
	public static void main(String[] args) {
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driver-class-name"));
			
		String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		conn = DriverManager.getConnection(url);
		
		String sql = prop.getProperty("update-query");
		pstmt = conn.prepareStatement(sql);
		
		String empid = args[0];
		int id = Integer.parseInt(empid);
		
		String name = args[1];
		
		String empsal = args[2];
		int sal =Integer.parseInt(empsal);
		String gender = args[3];
		
		pstmt.setInt(4, id);
		pstmt.setString(1, name);
		pstmt.setInt(2, sal);
		pstmt.setString(3, gender);
		
		int count = pstmt.executeUpdate();
		
		
		System.out.println(count + "Row(s) updated");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//Step 5 Close all JDBC Objects
			try {
				if(conn!=null) {
					conn.close();
				}
//				if(stmt!=null) {
//					stmt.close();
//				}
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


