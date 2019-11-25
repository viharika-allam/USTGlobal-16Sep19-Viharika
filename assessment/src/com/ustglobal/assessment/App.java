
package com.ustglobal.assessment;



	
	

	import java.util.List;
	import java.util.Scanner;

	import com.ustglobal.assessment.dao.InformationDAO;
	import com.ustglobal.assessment.dto.InformationBean;
	import com.ustglobal.assessment.util.InformationManager;

	public class App {
		public static Scanner scn = new Scanner(System.in);
		
		public static void main(String[] args) {
			App.useFull();
		}//end of main method
		
		public static  void mostUseFull() {
			
			System.out.println("Press 1 to call");
			System.out.println("Press 2 to message");
			System.out.println("Press 3 to go back to main menu");
			
			int ch1 = scn.nextInt();
				switch(ch1) {
				case 1:
					System.out.println("calling the contact");
					System.out.println("Press 1 to end the call");
					int a = scn.nextInt();
					if(a!=0) {
					System.out.println("Ending Call");
					}
					App.useFull();
					break;
					
				case 2:
					System.out.println("Type Message");
					String msg = scn.next();
					System.out.println("Your msg is :");
					System.out.println(msg);
					System.out.println("Sending Message....");
					App.useFull();
					break;
				case 3:
					App.useFull();
					break;
				
				}// end of switch
			
		
		}//end of mostusefull()
		
		public static void useFull() {
			System.out.println("Press 1 to Show all contact name");
			System.out.println("Press 2 to Search for contact");
			System.out.println("Press 3 to operate on contact");
			
			
			int ch = scn.nextInt();
			
			switch (ch) {
			case 1:
				InformationDAO dao = InformationManager.getInformationDAO();
				List<String> list = dao.getAllContactNames();
				for(String name:list) {
					System.out.println(name);
				}
				App.useFull();
				break;
			case 2:
				System.out.println("Enter name");
				String name = scn.next();
				InformationDAO dao2 = InformationManager.getInformationDAO();
				InformationBean bean2 = dao2.searchForContact(name);
				System.out.println(bean2.getName());
				System.out.println(bean2.getNumber());
				System.out.println(bean2.getGroups());
				App.mostUseFull();
				break;
			case 3:
				System.out.println("Press 1 to add contact");
				System.out.println("Press 2 to delete contact");
				System.out.println("Press 3 to edit contact");
				App.useFull();
				break;

			
			}
			
		}

	}//end of App class



