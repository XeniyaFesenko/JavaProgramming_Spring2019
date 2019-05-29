package day20_forloop;
import java.util.*;
public class Multiplication_table {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter your number:");
			int num = scan.nextInt();
			
			
		if (num < 1 || num >10) {
			System.out.println("ERROR: Invalid input");
			return; //stop execution here
			//System.exit(0); stop
		}
			//for loop to print multiplication table
			for(int i = 1; i <= 10; ++i) {
				System.out.println(num + " x " + i +" = "+ (num * i));
			}
		
	
}
	}