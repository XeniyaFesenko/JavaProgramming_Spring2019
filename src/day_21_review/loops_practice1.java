package day_21_review;
import java.util.*;
class loops_practice1 {
public static void main (String[]args) {
	
	
	Scanner scan = new Scanner(System.in);
	//As user to enter two ints
	//If some of those ints is not more than 100, then keep asking 
	//Once sum of those 2 mums more than 100 then “ good numbers”
	//Program ends

	int sum = 0;
	do {
		System.out.println("Enter two numbers:");	
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
	sum = num1+ num2;
	
	}while (sum <= 50);
	
	System.out.println("Good Numbers");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
