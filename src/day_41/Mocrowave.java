package day_41;

public class Mocrowave {

	String brand;
	boolean isOn;
	
	public void turnOn() {
		if (isOn == true) {
		System.out.println(brand + "microwave is already ON");
		
		}else {
			System.out.println("Turning on" + brand);
			isOn = true;
		}
	}
		public void turnOff() {
		if (!isOn == false) {
			System.out.println(brand + "microwave is already OFF");
		
		}else {
			System.out.println("Turning OFF" + brand);
			isOn = false;
		}
	
	}
		public void heat(String food) {
			if(isOn) {
				System.out.println("Heating " + food);
			}else {
				System.out.println("Microwave is OFF, cannot heat " + food);
			}
		}
		
	}