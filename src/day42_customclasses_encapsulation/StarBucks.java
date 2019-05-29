package day42_customclasses_encapsulation;
import java.util.*;
public class StarBucks {

	
	
	public static void main(String[] args) {
		//declare an array that sores two coffee objects.
		
		
		
		Coffee[] coffeeArray = new Coffee[2];
		coffeeArray[0] = new Coffee();
		coffeeArray[0].setCoffeeInfo("EXPRESSO", "TALL", 2.55, 7);
		coffeeArray[0].getCoffeeInfo();
		Coffee latte = new Coffee();
		latte.setCoffeeInfo("CAFE LATTE", "GRANDE", 3.85, 190);
		
		coffeeArray[1] = latte;
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
