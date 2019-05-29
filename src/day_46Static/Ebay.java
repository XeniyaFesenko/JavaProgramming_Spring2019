package day_46Static;

public class Ebay {
public static void main(String[] args) {
	Customer cm1 = new Customer("Abdallah Alies", "AbdallahAleies@gmail.com");
	Customer cm2 = new Customer("Adilet Kyrgyz", "adilet@yahoo.com");
	Customer cm3 = new Customer("Anastisiia Zasibna", "Anastisiia@outlook.com");

	
	System.out.println(cm3.count);
	System.out.println(Customer.count);
	
	Customer cm4 = new Customer("Burak Ucal", "burak@yahoo.com");
	cm1.count = 10;
	System.out.println(cm1.count);
	System.out.println(Customer.count);
}
}
