package com.ustglobal.webapp.servlete;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class GetEmpServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("empid"));
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info where id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		PrintWriter out = resp.getWriter();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
		
			
			if(rs.next()) {
				
				
				int a =rs.getInt("id");
				String b=rs.getString("name");
				int c=rs.getInt("sal");
					String d = rs.getString("gender");
					
				
				
				out.println("<html>");
				out.println("<body>");
				
				out.println("<tr>");
				out.println("<th>");
				
				out.println("id");
				out.println("</th>");
				
				out.println("<th>");
				out.println("name");
				out.println("</th>");
				
				out.println("<th>");
				out.println("salary");
				out.println("</th>");
				
				out.println("<th>");
				out.println("gender");
				out.println("</th>");
				
				out.println("</tr>");
				
				 out.println("<tr>");
				 out.println("<td>"); 
				 out.println(a);
				 out.println("</td>");
				 out.println("<td>"); 
				 out.println(b);
				 out.println("</td>");
				 out.println("<td>"); 
				 out.println(c);
				 out.println("</td>");
				 out.println("<td>");
				 out.println(d);
				  out.println("</td>");
				 
				out.println("</body>");
				out.println("</html>");
				


				
				
				
			}
				
		
			
		}catch(Exception e){
			e.printStackTrace();
		
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
					
				}
				if(rs!=null) {
					rs.close();
				}
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
	}


