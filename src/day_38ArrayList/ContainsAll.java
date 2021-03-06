package day_38ArrayList;
import java.util.*;
public class ContainsAll {
public static void main(String[] args) {
	
	List<Integer> num1 = new ArrayList<>();
	num1.add(10); num1.add(20); num1.add(30); num1.add(40);
	
	
	
	List<Integer> nums2 = new ArrayList<>();
	nums2.add(20); nums2.add(10); nums2.add(40); nums2.add(30);
	
	
	//test if nums1 all nums2 values
	if (num1.containsAll(nums2)) {
		System.out.println("Nums1 containsALL nums2");
	}else {
		
		System.out.println("Nums1 does not ContainAll nums2");
	}
	
	System.out.println(nums2.containsAll(num1));
	boolean b = num1.containsAll(nums2) && nums2.containsAll(num1);

	List<String> planA = new ArrayList<>();
	planA.add("java");
	planA.add("replit");
	planA.add("ping pong");
	planA.add("food");
	planA.add("run");
	planA.add("sleep");
	
	List<String> planB = new ArrayList<>();
	planB.add("food");
	planB.add("run");
	planB.add("sleep");
	planB.add("java");
	planB.add("ping pong");
	planB.add("replit");
	
	///check if both have same values, ignoring order
	if(planB.containsAll(planA) && planA.containsAll(planB) ) {
		System.out.println("Plans A and B match");
	}else {
		System.out.println("Plans A and B do not match");
	}
	
	
}
}