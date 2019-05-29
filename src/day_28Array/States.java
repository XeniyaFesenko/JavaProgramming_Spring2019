package day_28Array;

import java.util.Arrays;

public class States {
	public static void main(String[] args) {
		int[] [] nums = new int [3] [4]; 
		nums [0] [0] = 100;
		nums [0] [1] = 34534;
		nums [0] [2] = 343242;
		nums [0] [3] = 77242;
		
		nums [1] [0] = 256;
		nums [1] [1] = 1256;
		nums [1] [2] = 64546;
		nums [1] [3] = 527776;
		
		
		nums [2] [0] = 1256;
		nums [2] [1] = 164546;
		nums [2] [2] = 125776;
		nums [2] [3] = 1999776;
		
		System.out.println(Arrays.deepToString(nums));
		System.out.println(Arrays.toString(nums[0]));
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
}
