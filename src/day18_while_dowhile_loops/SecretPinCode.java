package day18_while_dowhile_loops;
import java.util.Scanner;
public class SecretPinCode {
	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		int secretPincode= 4321;
		
		//give only 3 attempts
		//if attempts reaches more than 3 print card blocked
		
		int pincode = 0;
		int attempts = 1;
		
		while (pincode != secretPincode && attempts <=3) {
			System.out.println("enter pincode");
			pincode = scan.nextInt();
			
			
			if (attempts ==3 && pincode != secretPincode) {
				System.out.println("card is blocked");
			return; //stop execution
			
		
		}
	
			System.out.println("");
	
	
	
	
	
		}
	}
	
	}
