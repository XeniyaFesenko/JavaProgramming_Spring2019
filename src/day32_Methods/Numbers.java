package day32_Methods;

import mentoring_IF_Vasil.String;

public class Numbers {
	   public static void main(String[] args) {
		int[] numbers = {421, 235, 435, 64, 547 , 63, 54, 845, 4};
		int min =findMin(numbers);
		double[] doubleNumbers = {421.99, 235.99, 435.00, 64.99, 547.99 , 63, 54, 845, 4};
		double m2 = findMin(numbers);
System.out.println(min);
System.out.println(m2);
	}
	
public static int findMin(int[] arr) {
	int min = arr[0];
	for(int i: arr) {
		if(i<min) {
			min=i;
		}
	}
	return min;
}
}