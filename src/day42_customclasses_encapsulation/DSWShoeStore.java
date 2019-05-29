package day42_customclasses_encapsulation;

import java.util.ArrayList;

public class DSWShoeStore {
public static void main(String[] args) {
	
	Shoes shoes1 = new Shoes();
	
	shoes1.setShoesData("ALDO", 6.5);
	System.out.println(shoes1.getShoesData());
	
	
	
	
	Shoes[] shoesArray = new Shoes[3];
	
	Shoes shoes2 = new Shoes();
	
	shoes2.setShoesData("Allen Edmonds", 7.5);

	
	
	
	Shoes shoes3 = new Shoes();
	
	shoes3.setShoesData("BOSS HUGO BOSS", 9.0);
	
	
	Shoes[] shoesArray1 = new Shoes[3];
	shoesArray1[0] = shoes1;
	shoesArray1[1] = shoes2;
	shoesArray1[2] = shoes3;
	
	System.out.println(shoesArray1[0].getShoesData());
	System.out.println(shoesArray1[1].getShoesData());
	System.out.println(shoesArray1[2].getShoesData());
	
	//ArrayList of Shoes
	ArrayList<Shoes> myShoes = new ArrayList<>();
	myShoes.add(shoes1);
	myShoes.add(shoes2);
	myShoes.add(shoes3);
	
	System.out.println(myShoes.get(0).size);
	System.out.println(myShoes.get(1).size);
	System.out.println(myShoes.get(2).size);


	for(Shoes shoes : myShoes) {
		System.out.println(shoes.getShoesData());
	}

	//print name of Shoes in the list that size is more than 7.
	for (Shoes shoes : myShoes) {
		if(shoes.size >7.0) {
			System.out.println(shoes.brand);
		}
	}




}

}
