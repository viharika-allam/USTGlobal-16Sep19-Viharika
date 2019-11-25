package com.ustglobal.jpawithjdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class SelectStatement {
	
public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//step1:load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			//step 2: Get the connection
			String url ="jdbc:mysql://localhost:3306/ust_ty_db?";
			conn =DriverManager.getConnection(url,"root","root");
			// step3: Issue SQl query
			stmt =conn.createStatement();
			String sql ="select * from employee_info";
			rs=stmt.executeQuery(sql);
			//step4:read the result
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");
				
				System.out.println("Id: "+id);
				System.out.println("Name: "+name);
				System.out.println("Salary: "+sal);
				System.out.println("Gende: "+gender);
				System.out.println("****************");
			}
					
			
		
		
		
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		//step 5: close all JDBC connections
		try {
			if(conn!=null) {
				conn.close();
			}
			if(stmt!=null) {
				stmt.close();
			}
			if(rs!=null) {
				rs.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	}//end of main



}
