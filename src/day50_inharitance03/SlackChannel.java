package day50_inharitance03;

public class SlackChannel {

	
	public static void main(String[] args) {
		SlackUser su = new SlackUser("Nadir");
		AdminUser au = new AdminUser("Florian");
		
		
		
		su.sendAMessage("This Thursday we will learn Jira");
		au.sendAMessage("Thank you");
	}
	
	
	
	
	
}
