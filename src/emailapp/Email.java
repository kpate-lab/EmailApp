package emailapp;

import java.util.Scanner;

public class Email {
	//do not want people to access these directly so make them private
	//access through class api
	//Variable SetUp
	private String firstname;  
	private String lastname;
	private String password;
	private String department;
	private int mailboxCapacity;
	private int defaultPasswordLength = 8;
	private String alternateEmail;
	
	//Constructor to receive first and last name
	
	//Name the Constructor -- same as class
	//Take in strings are parameters
	public Email(String firstName, String lastName) {
		
		this.firstname = firstName;
		this.lastname = lastName;
		System.out.println("EMAIL CREATED: " +  this.firstname + " " + this.lastname);
		
		//Call a method asking for the department + return the department
		//set the 'private string dept.' to the value of setDepartment
		this.department = setDepartment();
		System.out.println("\nDepartment: " + this.department);
	
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your Password is: " + this.password);
		
	}
	
	//Ask for the department
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nENTER DEPARTMENT #:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {return "sales";}
		else if (depChoice == 2) {return "dev";}
		else if (depChoice == 3) {return "acct";}
		else {return "-";}
		
	}
	//Generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		//
		for (int i=0; i<length; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password);
		
	}
	//Set the mailbox capacity
	
	//Set the alternate email
	
	//Change the password
	
}
