package mentoring_IF_Vasil;

import java.util.Scanner;

public class Seasons {
public static void main(String[] args) {
	// please write a program that will print season name
	// base on the int value
	//value will provided through the scanner
	//1
	//Winter
	//6
	//Summer
	


	
	/*Scanner scan = new Scanner(System.in);
	System.out.println("Enter month number");
	int month = scan.nextInt();
	
	if (month == 1 && month <=2 || month == 12 ) {
	System.out.println("Winter");
	
    }else if(month >=3 && month <=5) {
	System.out.println("Spring");
	
    }else if (month >=6 && month <=8) {
    	System.out.println("Summer");
    }else if (month >=9 && month <=11 ){ 
    	System.out.println("Fall");
    }else {
  	System.out.println("Invalid input");
    */	
	
	
	switch(month) {
	case 1:case 2:case 12:
	message = "Winter";
	break;
	case 3:case 4:case 5:
	message = "Spring";
	break;
	case 6:case 7:case 8:
	message = "Summer";
	break;
	case 9:case 10:case 11:
	message = "Fall";
	break;
	default:
	message = "Invalid number!";
}
}
}