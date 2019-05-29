package day37_ArrayList;
import java.util.*;
public class MyCities {
public static void main(String[] args) {
	ArrayList<String> cities = new ArrayList<>();
	cities.add("Barnaul");
	cities.add("Dushnabe");
	cities.add("Sterling");
	cities.add("Baku");
	cities.add("Tashkent");
	
	// Print each city using for each loop separated by space.
	for (String city : cities) {
		
		System.out.print(cities + " ");
		
}
	System.out.println();
	for (int i =0; i< cities.size(); i++) {
		//remove Baku
		System.out.println(cities.get(i)+" ");
	}
		System.out.println("removing Baku");
		cities.remove("Baku");
		System.out.println("New York");
		System.out.println(cities.toString());
	
		//is Empty?
		System.out.println("Is list empty?" + cities.isEmpty());
		cities.add(0, "Bishkek");
		System.out.println(cities.toString());
		cities.add(1, "Istambul");
		System.out.println(cities.toString());
		
		cities.set(2, "Seoul");
		System.out.println(cities.toString());
		int idx = cities.indexOf("Sterling");
		System.out.println("Sterling index: "+ idx);
		cities.set(idx, "Zagreb");
		System.out.println(cities.toString());
		cities.clear();
		boolean empty = cities.isEmpty();
		System.out.println("empty: " +empty);
		
	}
}
