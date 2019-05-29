package hw_practice;

import java.util.*;

public class array {
	public static void main(String[] args) {
	
		//assign to variable
		String word = "How are you?";
		String reversed = "";	
		for (int r = word.length()-1; r >=0; r-- ) {
		System.out.print(word.charAt(r));	
		reversed += word.charAt(r);
		}
	}
}