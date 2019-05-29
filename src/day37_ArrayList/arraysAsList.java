package day37_ArrayList;

import java.util.*;

public class arraysAsList {
	public static void main(String[] args) {

		// ArrayList<String> cars = (ArrayList<String>) Arrays.asList("Tesla",
		// "Porsche", "Lexus", "Honda" );
		List<Integer> nums = Arrays.asList(4, 5, 3, 2, 1);
		System.out.println(nums.size());
		System.out.println(nums.toString());
		//nums.add(100);
		System.out.println(nums.toString());
		// create array list prices
		// assign 10 calues using arrays.as list method

		List<Double> prices = Arrays.asList(1.3, 2.3, 3.45, 45.30, 54.40, 64.15, 70.00, 80.00, 9.22, 1.05);
		System.out.println(prices);

		// calculate sum of all prices
		double sum = 0;
		for (double price : prices) {
			sum += price;
		}
		System.out.println("Sum:" + sum);

		double sum2 = 0;
		for (int i = 0; i < prices.size(); i++) {
			sum2 += prices.get(i);
		}
		System.out.println("sum2:" + sum);
		
		// create new list expensive
		// add prices that are more than 100 from price list

		ArrayList<Double> expensive = new ArrayList<>();
		for (double price : prices) {
			if (price > 100.0) {
				expensive.add(price);

			}
		}

		System.out.println("Expensice:" + expensive);

	}
}
