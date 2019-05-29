package day_24_Arrays;
import java.util.*;
public class SumOfTheNumbers {

	public static void main(String[] args) {
		
		//lets create an array of integers length3
		
		int[] numbers = new int[3];
		// first value in array
		numbers[0]=5;
		// second value in array
		numbers[1]=10;
		//third value in array
		numbers[2]=20;
		//[I@33909752
		System.out.println(numbers);
		//to string method
		//toString() from arrays class can help as to print an arrays as string
		System.out.println(Arrays.toString(numbers));

		int sum= 0;
		//please use for loop, in order  to loop through the array and calculate sum of all elements
		
		//number.length --> returns numbers of elements in the araray
		
		for (int i = 0; i < numbers.length; i++ ) {
			sum += numbers[i];
		
		
		
		}
		System.out.print("Sum: "+sum);
		//find biggest value in array
		
		int max = Integer.MIN_VALUE;
		
		for (int i=0; i<=numbers.length; i++) {
	
		if(numbers[i] >max) {
			max = numbers[i];
			System.out.print("max value:" +max);
		}
	int min = Integer.MAX_VALUE;
		
		for (int k = 0; k<=numbers.length; k++) {
	
		if(numbers[k] <min) {
			min = numbers[k];
			System.out.print("max value:" +min);
		}
}
}
	}
}