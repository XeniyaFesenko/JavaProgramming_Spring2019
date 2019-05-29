package hw_practice;
import java.util.*;
public class Calculator {
public static void main(String [] args) {
	
	
	
	Scanner copyPaste = new Scanner(System.in);
	double result = 0;
	double num1 = 0;
	double num2 = 0;
	String operator = "";

	System.out.println("num1 :");
	num1 = copyPaste.nextDouble();
	
	while (true) {
		System.out.println("operator");
		operator = copyPaste.next().substring(0);
		if (operator.equals("s")) {
			break;
		} else {
		System.out.println("num2:");
		num2 = copyPaste.nextDouble();
		
		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "%":
			result = num1 % num2;
			break;
		
		}
		System.out.println("num1 " +result);
		num1 = result;
		
	}
	}
}
}