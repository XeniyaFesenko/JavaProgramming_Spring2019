package day30_methods02;
import java.util.*;
public class print5stars {
public static void main(String[] args) {
	

	Print5stars();
	Print4stars();
	Print3stars();
	Print2stars();
	Print1stars();
	introduce();
	introduce();
	//call print5stars 100 times
	
	for(int i = 0; i<=100; i++) {
	Print5stars();
}	
}
	
	
	
	public static void Print5stars(){
	System.out.println("* * * * *");
	}
	
	public static void Print4stars(){
	System.out.println("* * * * ");
	}
	public static void Print3stars(){
		System.out.println("* * * ");
	}
	public static void Print2stars(){
		System.out.println("* * ");
	}
	public static void Print1stars(){
		System.out.println("*  ");
		
	}
		
	public static void introduce() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scan.next();
		System.out.println("Nice to meet you, " + name);
		
	}
	
	
}
