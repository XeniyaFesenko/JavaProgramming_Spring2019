package day_19;
import java.util.*;
public class guessAnumber {
public static void main(String [] args) {
	
	
	//secretNumber = 10; //1-100	

//guessNumber = 5;

//"your number is to small"


//GuessNmber = 50;
//"your number is to large"
//guessNumber =10;
//"Bingo, congradulations, you won"

	
	Scanner scan = new Scanner(System.in); {
	Random random = new Random(); // is used to generate random numbers
	
	
	
	

	int secretNumber = random.nextInt();
	
	int guessNumber = 0;
	
	do {
	System.out.println("Guess a number: ");
	guessNumber = scan.nextInt();
	
	if(guessNumber <secretNumber) {
		System.out.println("Your number is to small");
	}else if (guessNumber > secretNumber) {
		System.out.println("Your number is to large");
	}
	}while(guessNumber != secretNumber);
	
	
	
	System.out.println("Bingo, Congradulations, you won!");	
		
		
		
		
		
		
		
		
	}
		
	}
}
	