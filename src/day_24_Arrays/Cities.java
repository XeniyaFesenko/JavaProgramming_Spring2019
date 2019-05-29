package day_24_Arrays;

public class Cities {
	public static void main(String[] args) {
		String[] cities = {"Washington D.C.", "Kiev", "Annandale", "Moscow", "Istambul", "Baku","Istambul", "Miami", "Silver Spring", "McLean"};
		System.out.println(cities.length);
		
		for (int i = 0; i< cities.length; i++) {
			if (cities[i].startsWith("M"));
			System.out.println(cities[i]);
			
			
	}

	// same thing
		for (String city:cities) {
			if (city.startsWith("M")) {
				System.out.println(city);
				
			}
		


		}
	}
}





