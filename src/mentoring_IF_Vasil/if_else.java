package mentoring_IF_Vasil;

import java.util.Scanner;

public class if_else {
	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Enter your age: ");
		int age = scan.nextInt();
		
		if (age > 0 && age < 21) {
		System.out.println("Underage!");
		
		} else if (age <1) {
			System.out.println("Invalid age");
			
		
		}else {
			
		System.out.println("You are good to go:)");
		}
		
		int time = 20;
//		
		int let = 17;
		//comndition ? if true : if false
		
		System.out.println(time <18 ? "Good afternoon ": "Good evening");
	
		System.out.println(let <18? "You are underage" : "you age good");
		
		Scanner scan1 = new Scanner (System.in);
		System.out.println("Enter the score: ");
		int score = scan.nextInt();
		
		System.out.println(score>64? "Passed" :"Fail");
	 
		
	
		Scanner scan2 = new Scanner (System.in);
		System.out.println("Enter your height");
		int height = scan.nextInt();
		System.out.println(height >164? "tall": "short");
	
		
		Scanner scan3 = new Scanner (System.in);
		System.out.println("Enter the score: ");
		int score3 = scan.nextInt();
		System.out.println(score>64? "Passed": score< 0 ? "Invalid Data": ""
			
			
			
			
	}
}
