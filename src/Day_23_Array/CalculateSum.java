package Day_23_Array;
import java.util.*;
public class CalculateSum {
public static void main(String[] args) {
		
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