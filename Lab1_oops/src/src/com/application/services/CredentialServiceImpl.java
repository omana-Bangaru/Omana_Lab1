package com.application.services;

import com.application.model.Employee;

import java.util.Random;
import java.util.Random.*;

public class CredentialServiceImpl implements CredentialServicesInterface{

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		String capCharacter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallCharacter = "abcdefghijklmnopqrstuvwxyz";
		int numberers = 1234567890;
		String special = "!@#$%^&*";
		String value = capCharacter+smallCharacter+numberers+special;
		Random randomNum = new Random();
		
		char[] password = new char[8];
		for(int i=0; i< 8; i++ ) {
			int number = randomNum.nextInt(value.length());
			password[i] = value.charAt(number);
		}
		
		return new String(password);
	}

	@Override
	public String generateEmailAddress(Employee employee, String department) {
		// TODO Auto-generated method stub
		
		return(employee.getFirstName()+employee.getLastName()).toLowerCase()+"@"+department+"."+ "abc.com";
	}

	@Override
	public void showCredential(Employee employee, String department) {
		// TODO Auto-generated method stub
		System.out.println("Dear "+ employee.getFirstName()+" your generated credentials are as follows: ");
		System.out.println("Email- " + generateEmailAddress(employee, department));
		System.out.println("Password- " + generatePassword());
	}
	
	
}
