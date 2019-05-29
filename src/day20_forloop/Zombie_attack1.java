package day20_forloop;
import java.util.*;
public class Zombie_attack1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String password = "abc123";
		String input;
		
		do {
			System.out.println("Enter password");
			input = scan.next();
		}while(!input.equals(password));
		//if input is not same as password, keep asking to enter
		
	}
}


