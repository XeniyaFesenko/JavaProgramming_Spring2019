package day40;

public class BestBuy {
	public static void main(String[] args) {

		//System.out.println(brand);
			//Above line will not work, we need object to use brand
			//Create CellPhone object
			cellPhone cell1 = new cellPhone();
			System.out.println(cell1.brand);
			System.out.println(cell1.screenSize);
			System.out.println(cell1.Color);
			System.out.println(cell1.price);
			
			cell1.brand = "Nokia 6300";
			cell1.screenSize = 2.0;
			cell1.Color= "Silver";
			cell1.price= 79.16;

			System.out.println("Brand: " + cell1.brand);
			System.out.println("Screensize: " + cell1.screenSize);
			System.out.println("Color: " + cell1.Color);
			System.out.println("Price: " + cell1.price);
			
			
			
			cellPhone cell2 = new cellPhone();
			System.out.println(cell2.brand);
			System.out.println(cell2.screenSize);
			System.out.println(cell2.Color);
			System.out.println(cell2.price);
			
			cell2.brand = "Siemenns";
			cell2.screenSize = 1.6;
			cell2.Color= "Blue";
			cell2.price= 35.0;

			System.out.println("####### CELL 2 VALUES ######");
			System.out.println("Brand: " + cell2.brand);
			System.out.println("Screensize: " + cell2.screenSize);
			System.out.println("Color: " + cell2.Color);
			System.out.println("Price: " + cell2.price);
			
			System.out.println("##### CALLING METHODS #####");
			cell1.call();
			cell1.message();
			cell1.takePhoto();
			
			cell2.call();
			cell2.message();
			cell2.takePhoto();
			
}
}