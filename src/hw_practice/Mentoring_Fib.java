package hw_practice;
import java.util.*;
public class Mentoring_Fib {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	String sentence = input.nextLine();
	
	String str[] =sentence.split(" ");
    
    for (int i = str.length -1; i>=0; i--) {
      String word = str[i];
    
    System.out.println(word);

    }
    }
}