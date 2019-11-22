package com.ustglobal.empapp;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManager;

public class App {
	public static void main(String[] args) {
		System.out.println("Press 1 to get all employee data");
		System.out.println("Press 2 to insert  employee data");
		System.out.println("Press 3 to update  employee data");
		System.out.println("Press 4 to delete employee data");
		System.out.println("Press 5 to search single employee data");
		
		Scanner scn = new Scanner(System.in);
		int ch = scn.nextInt();
		
		switch(ch) {
		case 1:
			EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
			List<EmployeeBean> result = dao.getAllEmployeeData();
			
			for(EmployeeBean bean : result) {
				
					System.out.println("Id: "+bean.getId());
					System.out.println("Name: "+bean.getName());
					System.out.println("Salary: "+bean.getSal());
					System.out.println("Gender: "+bean.getGender());
				
				}
			
			
			break;
		case 2:
			EmployeeBean bean2 = new EmployeeBean();
			int id2 = scn.nextInt();
			bean2.setId(id2);
			String name2 =scn.next();
			bean2.setName(name2);
			int sal2 =scn.nextInt();
			bean2.setSal(sal2);
			String gender2 =scn.next();
			bean2.setGender(gender2);
			EmployeeDAO dao2 = EmployeeManager.getEmployeeDAO();
			int count2 = dao2.insertEmployeeData(bean2);
			
			System.out.println(count2 +" rows inserted ");
			
		
			
			break;
			
		case 3:
			int id3 = scn.nextInt();
			
			String name3 =scn.next();
			
			int sal3 =scn.nextInt();
			
			String gender3 =scn.next();
			
			EmployeeBean bean3 = new EmployeeBean();
			bean3.setId(id3);
			bean3.setName(name3);
			bean3.setSal(sal3);
			bean3.setGender(gender3);
			

			EmployeeDAO dao3 = EmployeeManager.getEmployeeDAO();
			int count3 = dao3.updateEmployeeData(bean3);
			
			System.out.println(count3 +" rows updated ");
			
			
			break;
		case 4:
			
			int id4 = scn.nextInt();
			EmployeeDAO dao4 = EmployeeManager.getEmployeeDAO();
			int count4  = dao4.deleteEmployeeData(id4);
			System.out.println(count4 +" rows deleted ");
			
			
			break;
		case 5:
			EmployeeDAO dao5 = EmployeeManager.getEmployeeDAO();
			int id5 = scn.nextInt();
			EmployeeBean bean5 = dao5.searchEmployeedata(id5);
			
			
			if(bean5!=null) {
				System.out.println("Id: "+bean5.getId());
				System.out.println("Name: "+bean5.getName());
				System.out.println("Salary: "+bean5.getSal());
				System.out.println("Gender: "+bean5.getGender());
				
			}else {
				System.out.println("no data found");
			}
			break;
		}
			
	}
}