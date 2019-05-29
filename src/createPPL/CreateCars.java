package createPPL;

public class CreateCars {

	
	public static void main(String[] args) {
		Car delorean = new Car("GM", "De Lorean", "20000");
		
		System.out.println(delorean.getMake());
		System.out.println(delorean.getModel());
		System.out.println(delorean.getPrice());
		
		
		delorean.setPrice("1900");
		System.out.println(delorean.getPrice());
		
	}
}
