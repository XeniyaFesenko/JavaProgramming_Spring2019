package Day_23_Array;

import java.util.Scanner;

public class Print_numbersWithLoops {
	public static void main(String [] args) {
	Scanner scan = new Scanner(System.in);
	int number = 0;
	
	for(int i=0; i<=50; i++) {
		System.out.println("Enter a number: ");
		number = scan.nextInt();
		if(number%5!=0 && number%20!=0) {
			continue;
		}System.out.println("it is divisible by 5");
		if(number%20!=0) {
			break;
		}System.out.println("It is divisible by 20");
	}
	
}
}
