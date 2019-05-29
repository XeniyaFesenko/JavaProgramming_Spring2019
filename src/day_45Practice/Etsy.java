package day_45Practice;

import java.util.Random;

public class Etsy {

	
	private String email;
	private String firstName;
	private String password;
	
	
	
	// constructor 1. no- args. set all as empty string
	public Etsy() {
		email = "";
		firstName = "";
		password = "";
	}
	
	// constructor 2. take 3 args and set them to instance variables using setters;
	public Etsy( String email, String firstname, String password){
	
		setEmail(email);
		setFirstName(firstname);
		setPassword(password);
	}
	
	/* constructor 3.
	 * Email. firstname ==> call setters methods
	 * password is auto generated and assigned
	 */
	public Etsy(String email, String firstname) {
	setEmail(email);
	setFirstName(firstname);
	this.password //random, password with 6 characters
	}
	
	private String getRandomPassword() {
		Random rd = new Random();
		String letters = "abcdefghijklmnopqrstuvwxyz0123456789";
		String rdPassword = "";
		for(int i =1; i<=6; i++) {
			letters.charAt(rd.nextInt(letters.length()))
		}
	
}
	@Override
	public String toString() {
		return "Etsy [email=" + email + ", firstName=" + firstName + ", password=" + password + "]";
	}
	public String getEmail() {
		return email;
		
		
	}
	public void setEmail(String email) {
		
		//if it contains @ somewhere in the middle. assign it
		// if not print "please enter a valid email.address"
		
		if(email.indexOf('@') > 0 && email.indexOf('@')!= email.length() -1) {
			
		
			this.email = email;
		}else {
			System.out.println("Please enter a valid email address."); 
		}
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		//cant be blank.
		//needs to be only Alphabetic/letters
		
		this.firstName = firstName;
		
		
	}
	/*
	 * valid -> all letters, can have space in middle
	 * invalid -> cannot contain numbers or any other chars
	 */
	
	private boolean isValidFirstName(String firstName) {
		//check first if it starts with or ends with space
		//return false if true
		if(firstName.startsWith(" ") || firstName.endsWith(" ")) {
			return false;
		}
		
		if(firstName.isEmpty()) {
			System.out.println("Cannot be blank.");
			return false;
		}
		
		for(int i = 0; i < firstName.length(); i++) {
			char ch = firstName.charAt(i); //  %
			if(!Character.isAlphabetic(ch) && ch !=' ') {
				return false;
			}
		}
		
		return true;
		
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if (password.length() <6) {
			System.out.println("Must be at least 6 characters.");
		}else {
		this.password = password;
	}
	
}
}
