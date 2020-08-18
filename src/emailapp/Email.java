package emailapp;

import java.util.Scanner;

public class Email {
	
	/* Variable SetUp
	 * Don't want people to access these directly so make them private
	 * Access through class API */
	private String firstname;  
	private String lastname;
	private String password;
	private String email;
	private String department;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 8;
	private String alternateEmail;
	private String companySuffix = "company.com";
	
	//TODO Constructor to receive first and last name
	
	/* Name the Constructor -- same as class
	 * Take in strings are parameters */
	public Email(String firstName, String lastName) {
		
		this.firstname = firstName;
		this.lastname = lastName;
		
		//Call a method asking for the department + return the department
		//set the 'private string dept.' to the value of setDepartment
		this.department = setDepartment();
	
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		
		//Combine Elements to generate email
		email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "." + companySuffix;
	}
	
	//TODO Ask for the department
	private String setDepartment() {
		System.out.print("New Employee: "+ firstname + " " + lastname + "\n\nDEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nENTER DEPARTMENT #:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		in.close();
		if (depChoice == 1) {return "sales";}
		else if (depChoice == 2) {return "dev";}
		else if (depChoice == 3) {return "acct";}
		else {return "-";}
		
	}
	//TODO Generate random password
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
	//TODO Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
		
	}
	//TODO Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
		
	}
	//TODO Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	//getMethods
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "--------------------------------------" +
				"\nDisplay Name: " + firstname + " " + lastname +
				"\nCompany Email: " + email + 
				"\nPassword: " + password + 
				"\nMailbox Capacity: " + mailboxCapacity + " MB"+ 
				"\n--------------------------------------";
	}
}

