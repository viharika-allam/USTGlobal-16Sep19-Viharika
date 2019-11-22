package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteDeleteQuery {
	public static void main(String[] args) {
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		try {
			//Step 1 Load Driver
			//Driver driver = new Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			//Step 2 Get the Connection
			String url ="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//Step 3 Issue SQL query
			String sql ="delete from employee_info where id=? ";
					
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
		

		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
		
	}

	}


