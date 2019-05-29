package day_27_Arrays05;

import java.util.Arrays;

public class Arrays_Class {

	public static void main(String[] args) {
		int [] nums = {43,12,4,1,3,5};
		
		// to string method
		Arrays.toString(nums);
		System.out.println(Arrays.toString(nums));
		String str = Arrays.toString(nums);
		System.out.println(str);
		
		//sort method.  sorts array in ascending order
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		String [] languages = {"Zulu", "Italian", "Englush", "Polish", "Arabic"};
		System.out.println(Arrays.toString(languages));
		
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
		
	 int [] nums2 = {345, 665, 3333, 11, 8, 66};
	 // find the lower and largest values nums2 array
	 
	 //System.out.println(Arrays.toString(nums2));
	  Arrays.sort(nums2);
	  
	  int lowest = nums2[0];
	  int largest = nums2[ nums2.length-1];
	  System.out.println("Lowest num: " + lowest);
	  System.out.println("Largest num:" + largest);
	  
	  
	  //binary search
	  
	//  int [] nums3 = {4, 10, 20, 50};
	//  Arrays.binarySearch(nums, 10) ===1
			  
			  
			  
			   String [] names = {"John", "Luke", "Anna", "Mark", "Tom"};
			  
			    System.out.println(Arrays.toString(names));
	  
			    Arrays.sort(names);
				System.out.println(Arrays.toString(names));
	}
}
