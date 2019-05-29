package day_39;
import java.util.*;
public class cities {
public static void main(String[] args) {
	
	ArrayList<String> cities = new ArrayList<>();
    
    cities.add("Tokyo");
    cities.add("New York");
    cities.add(0,"Paris");
    cities.add("Pittsburgh");
    cities.add(1,"Berlin");
    cities.add("Madrid");
    cities.add("Moscow");
    cities.add("Istanbul");
    cities.add("Washington D.C.");
    cities.add("Amsterdam");
    cities.add("Zurich");
    cities.add("Singapore");
    cities.add("Milan");
    cities.add("Toronto");
    cities.add("London");
	
    //priont for each loop
	for(String city : cities) {
	System.out.println(city + "|");
	}
	
	for(int i = 0; i<cities.size(); i++) {
		System.out.println(cities.get(i)+"|");
	}
		System.out.println();
	
	
	
	System.out.println(cities.toString().toUpperCase());
	System.out.println(cities);
	
	String paris = cities.get(0);
	System.out.println(paris);
	
	//cities.get(0).toUpperCase();
	cities.set(1, cities.get(1).toUpperCase());

	
	for(int j = 0; j<cities.size(); j++) {
		String city = cities.get(j).toUpperCase();
		cities.set(j, city);
		
		System.out.println(cities.toString());
		
		//find the longest city
		//find the shortest city.
		String longestCity="";
		String shortestCity="";
		
		for (String city1 : cities) {
			if (city1.length()> longestCity.length()) {
				longestCity= city1;
		
		for		(String  city2 : cities) {
	if( city2.length() < shortestCity.length()) {
		shortestCity = city2;
		}
				
			}
		}
		
		
			System.out.println("longestCity:" + longestCity);
			System.out.println("shortestCity:" + shortestCity );
		
		ArrayList<String> citiesMoreThan6 = new ArrayList<>();
		for (String ct : cities) {
		if(ct.length()>6) {
		citiesMoreThan6.add(ct);
			}
		
		
		
		
		
		}
		
	}
	
	
}
	
	}
}
