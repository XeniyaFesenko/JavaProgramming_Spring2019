package hw_practice;
import java.util.*;
public class printInReverse {

	public static void main(String[] args) {

		 Scanner in = new Scanner(System.in);
	     
		 String word = in.nextLine();
		 word = word.trim();
		 String result = ""; 
	     char[] ch=word.toCharArray();  
		 for (int i = ch.length - 1; i >= 0; i--) {
				 result += ch[i];
			 }
		 System.out.println(result.trim()); 
		 }			
	}
