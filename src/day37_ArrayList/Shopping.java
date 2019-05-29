package day37_ArrayList;

import java.util.ArrayList;

public class Shopping {
public static void main(String[] args) {
	String [] str = new String [6];
	ArrayList<String> shoppingList = new ArrayList<>();
	
	shoppingList.add("watch");
	shoppingList.add("car");
	shoppingList.add("shoes");
	shoppingList.add("house");
	shoppingList.add("diamonds");
	shoppingList.add("purse");
	
	//print number of items
	int count = shoppingList.size();
	System.out.println("Total count: "+ count);
	
	//print all items in single line.
	System.out.println(shoppingList.get(0)+" | "+ shoppingList.get(count-1));
	shoppingList.remove("watch");
	shoppingList.remove("car");
	System.out.println(shoppingList.toString());
	System.out.println(shoppingList.get(0));
	
	for (String item : shoppingList) {
	
	System.out.println(item);
	}
	shoppingList.clear();
	System.out.println(shoppingList);
	
	
	
	
	
}
}
