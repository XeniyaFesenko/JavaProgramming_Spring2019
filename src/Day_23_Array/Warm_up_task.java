package Day_23_Array;

import java.util.Scanner;

public class Warm_up_task {
	
	public static void main(String [] args) {
	
		//---PRIME NUMBERS WARMUP
		//A Prime Number is: a whole number that cannot be made by multiplying other whole numbers. 
		//A prime number is a whole number greater than 1 whose only factors are 1 and itself.
		// A factor is a whole numbers that can be divided evenly into another number. 
		//The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29. 
		//Numbers that have more than two factors are called composite numbers.
		
		
		
		Scanner scan = new Scanner(System.in);

		
		System.out.println("enter a number");
		
		int num = scan.nextInt();
		int count=0;
		for (int i = 2;  i<= num ;i ++) {
			
			if(num%i==0) {
				count++;
			}
			
			
		}if(count>1) {
			System.out.println("not prime");
		}else System.out.println(num +" is prime");


		
	}

}