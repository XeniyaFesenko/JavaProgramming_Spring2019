package hw_practice;
import java.util.*;
public class triangle {
	
		
	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] nums = new int[size];
	    for(int i = 0; i < size; i++){
	      nums[i] = scan.nextInt();
	    }
	    //WRITE YOUR CODE HERE
	    for(int i = 0; i < nums.length - 1; i++)
				nums[i] = nums[i+1];
			nums[nums.length-1] = size;
			System.out.println();
		}
		
	}
