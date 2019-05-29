package hw_practice;
import java.util.*;
public class array2 {
	public static void main(String[] args) {
		int[] inhabitants = {2,2,0,8,5,9,5,9};
		for(int i =0; i<inhabitants.length-1;i++) {
			for(int j = 0; j<inhabitants.length-1;j++)
			if(inhabitants[j]==0) {
				inhabitants[j-1]=inhabitants[j-1]/2;
				inhabitants[j+1]=inhabitants[j+1]/2;
			
			}
			System.out.println("Day "+i+" "+Arrays.toString(inhabitants));
			
		}
	}
}