package com.application.main;
import java.util.Scanner;

import com.application.model.Employee;
import com.application.services.CredentialServiceImpl;
import com.application.services.CredentialServicesInterface;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CredentialServicesInterface Service = new CredentialServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your first name");
		String firstName = sc.next();
		System.out.println("Please enter your Last name");
		String lastName = sc.next();
		Employee employee = new Employee(firstName,  lastName);
		String department = null; 
		Service.generatePassword();
		
		System.out.println("Please enter your choice");
		int choice = sc.nextInt();
		switch(choice) {
		 case 1:
			 department="tech";
			 break;
		 case 2:
			 department="admin";
			 break;
		 case 3:
			 department="hr";
			 break;
		 case 4: 
			 department="legal";
			 break;
		default :
			System.out.println("please enter the correct choice");
			return;
		}
		Service.generateEmailAddress(employee, department);
		Service.showCredential(employee, department);
	}
	
	

}
