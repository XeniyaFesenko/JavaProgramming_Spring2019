package day30_methods02;

public class StudentsAtSchool {
public static void main(String[] args) {
	
	
	
	study(" Selenium");
	study("SQL");
	sleep(5);
	
}
	
	
	
	
	public static void study(String topic) {
		System.out.println("Student is studying" + topic);
	}
		
		// Method name:sleep
		//return type: void
		//params/args/input: int hours
		
		//Method accepts hours value and prints
		//""
		public static void sleep(int hours) {
		System.out.println("Srudent been sleeping for 5 hours");	
			
	}
}
