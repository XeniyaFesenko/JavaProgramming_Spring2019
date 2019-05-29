package day_27_Arrays05;

import java.util.Arrays;

public class Canvas_Courses {
public static void main(String[] args) {
	
	
	
	// 147 ---> Java Programming
	//204 ---> mentoring sessions
	//149 ---> SDLC
	// 152---->  Qa Tessting
	//144 --->Team Activity
	//143 --> Welcome kit
	
	
	 
	
	//--> split by "/" and get the last value from array
	//--> convert it to integer. Integer.parseInt(...) -> int value
	//--> switch statement and find the matching

	
	String url = "https://learn.cybertekschool.com/courses/149";
	//split by / and store into array
	String[] urlArr = url.split("/");
	System.out.println(Arrays.toString(urlArr));
	System.out.println("Length:" + urlArr.length);
	//get last number and convert to int data type
	System.out.println(urlArr[urlArr.length - 1]);
	
	int courseID = Integer.parseInt(urlArr[4]);
	//use switch statement to find course name
	
	switch(courseID) {
	case 147:
		System.out.println("the course is Java Programming");
		break;
	case 204:
		System.out.println("Mentoring Sessions");
		break;
	case 149:
		System.out.println("SDLC");
		break;
	case 152:
		System.out.println("Qa Testing");
		break;
	case 144:
		System.out.println("Team activity");
		break;
	case 143:
		System.out.println("Welcome Kit");
		break;
	default:
			System.out.println("Invalid number for the course");
			break;
	}	
	
	
	
}
}