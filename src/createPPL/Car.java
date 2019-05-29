package createPPL;

public class Car {

	String make, model, price;
	
	public Car(String mmake, String model, String price)
	make = mmake;
	this.model = model;
	this.price = price;
	
}

	public void setPrice(String price) {
		this.price = price;
		this.make = make;
	}
	
	public String getMake() {
		return make;
		
	}
	
	public String getModel() {
		return model;
	}
	
	