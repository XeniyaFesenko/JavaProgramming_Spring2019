package day_25Arrays03;

public class Shopping {
	public static void main(String[] args) {
		
		
		String[] products = {"Timberland shoes", "H&M shirt", "Swatch Watch Watch", "Gucci Bar", "Swatch" };
		double[] prices = {120.0, 5.99, 150.50, 3000.5, 6.99};
		
		int [] itemsId = {12345, 12346, 12347, 12348, 12349};
		
		// Print count of products:
		// loop through products and print each one in separate line
		
		System.out.println("Products count: " + products.length);
			
		// check if products items and products prices have the same count
		
		if (prices.length == products.length && products.length ==itemsId.length){
			System.out.println("Shopping list looks good");
		} else {
		
		System.out.println("Something is wrong with this list");
		return;
		
		}
	
		//prices --> for loop
		for (int i = 0; i<prices.length; i++) {
		System.out.println();	
		
		//itemId --> print this in reverse order using a loop
		
		System.out.println(itemsId[ itemsId.length -1]);
		for (int idx = 0;  idx<  itemsId.length; idx--) {
		System.out.println(itemsId[idx]);
		
		//print a report with a total price
		
		//print a report. with a total price
		//item 1: 12345 - Timberland Shoes - $120.0
		//...
		//Total price:
		
		System.out.println("#### YOUR SHOPPING RECEIPT ####");
		double totalPrice = 0.0;
		
		for (int i1 = 0; i1 < products.length; i1++) {
			
		
		System.out.println("Item "+ (i1+1) +":" + itemsId[i1] + products[i1]+ "-"+prices[i1] );
		totalPrice += prices[i1];
		
		}
		System.out.println("Total price: $" + totalPrice);
		
		}
	    
		int maxIndex = 0;
		double maxPrice = 0;
		//
		
		for (int j = 0; j < prices.length; j++) {
		if (prices[j] > maxPrice) {
			maxPrice = prices[j];
			maxIndex = j;
		
		System.out.println(itemsId[maxIndex] + "-" + products[maxIndex] +  "-" + " $" + maxPrice);
		
		
		}
		}
		
		
		
		
		
		}
		
		
		
		
		
		
		}
	
}
