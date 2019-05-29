package day_27_Arrays05;

import java.util.Arrays;

public class Copy_Of2 {
public static void main(String[] args) {
	
	// copy all the values of array and also add 2 more spaces
	
	int [] nums1 = {34, 56, 23, 1, 55};
	int [] nums2 = Arrays.copyOf(nums1, nums1.length +2);
	int [] num3 = Arrays.copyOfRange(nums1, 1, 3);
	System.out.println("Nums3: " + Arrays.toString(num3));
	
	System.out.println(Arrays.toString(nums2));
	nums2 [5] = 100;
	nums2 [6] = 100;
	
	System.out.println(Arrays.toString(nums2));
	
	
	
	int[] brandNew = {34, 23, 54, 23};
	
	System.out.println("Length before:" + brandNew);
	brandNew = Arrays.copyOf(brandNew, brandNew.length +5);
	System.out.println("Length after: " );
	
	
	
	
 }
}
