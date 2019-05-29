package day50_inharitance03;

public class Contractor extends Employee {

	

		
		
		
	@Override
	public void CalculatePay (int hours, double rate) {
	double total = hours * rate + 200;
	System.out.println("Constractor total pay:" + total);
	
}
}