package day_46Static;

public class Restaurant {
public static void main(String[] args) {
	
	
	Dinner Mom = new Dinner();
	Dinner kid = new Dinner();
	Dinner Dad = new Dinner();
	
	
	System.out.println("Total slices: "+ Dinner.pizzaSlices);
	Dad.takeASlice();
	kid.takeASlice();
	Mom.takeASlice();
	
	System.out.println("Toatl slices: " + Dinner.pizzaSlices);
	System.out.println("Toatl slices: " + Dad.pizzaSlices);
	
	kid.takeASlice(3);
	Dad.takeASlice(2);
	Mom.takeASlice();
	
	System.out.println("Total slices: "+ Mom.pizzaSlices);



}



	
	
}

