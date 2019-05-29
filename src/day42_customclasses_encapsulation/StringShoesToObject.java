package day42_customclasses_encapsulation;
import java.util.*;
public class StringShoesToObject {
	public static void main(String[] args) {
		
	
	String data = "Bruno Magli,9.5";
	Shoes sh1 = new Shoes();
	
	//split using, and store into attay
	String [] arrData = data.split(",");
	//Create Shoes object
	Shoes shoes = new Shoes();
	sh1.setShoesData(arrData[0],Double.parseDouble(arrData[1]));
    System.out.println(shoes.getShoesData());
	
	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("What shoes brand?");
	String brand = scan.next();
	System.out.println("What is your size?");
	double size = scan.nextDouble();
	
	Shoes myShoes = new Shoes();
	myShoes.setShoesData(brand, size);
	System.out.println(myShoes.getShoesData());
}
}
