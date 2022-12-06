package com.application.services;
import com.application.model.Employee;
public interface CredentialServicesInterface {
	
	public String generatePassword();
	public String generateEmailAddress(Employee employee, String department);
	public void showCredential(Employee employee, String department);
	
}
