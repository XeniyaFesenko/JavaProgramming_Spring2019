package mentoring_IF_Vasil;

public class Email {
	public static void main(String[] args) {
		String email = generateEmail("James", "Bark");
		System.out.println(email);
	}
	
	public static String generateEmail(String firstName, String lastName) {
		return firstName.toLowerCase() +"_"+lastName.toLowerCase()+"@gmail.com";
		
	
	}
 
	public static String generateEmail(String firstName, String lastName, String domain) {
		return firstName.toLowerCase() +"_"+lastName.toLowerCase()+"@"+domain+".com";
		



}

}