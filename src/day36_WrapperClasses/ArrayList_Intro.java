package day36_WrapperClasses;
import java.util.ArrayList;
public class ArrayList_Intro {
	public static void main(String[] args) {
		//create an arraylist
		String [] str = new String [5];
		ArrayList<String> names = new ArrayList<>();
		int[] numsArray = new int[5];
		ArrayList<Integer> nums = new ArrayList <>();
		
		//assign values into arraylist
		names.add("Roman");
		names.add("Orhan");
		names.add("Vlad");
		names.add("Olimjan");
		names.add("Natalia");
		nums.add(100);
		nums.add(200);
		nums.add(900);
		nums.add(80);
		
		 
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		
		System.out.println("Names count: " + names.size());
		System.out.println("Names count: " + nums.size());
	}

}
