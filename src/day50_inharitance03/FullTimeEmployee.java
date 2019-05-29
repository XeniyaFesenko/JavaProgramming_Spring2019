package day50_inharitance03;

public class FullTimeEmployee extends Employee{

	@Override// check if method is really overriden
	public void CalculatePay (int hours, double rate) {
	
	double total = (hours * rate) * 0.05 + (hours * rate);
	System.out.println("FullTimeEmployee total pay: " + total);
	
}
}