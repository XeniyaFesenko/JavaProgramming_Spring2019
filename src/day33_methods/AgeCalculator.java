package day33_methods;

public class AgeCalculator {

	
	
	
	
	public static int calculateAge(int year) {
		int currentYear= 2019;
	int age = currentYear - year;
	
	
	
		
		
		
	if (age < 0) {
	System.out.println("Invalid Age!");	
	return 0;
	
	}else if 
	(age >=15 && age <=14) {
	System.out.println("Child");
	
	}else if 
	(age >= 15 && age <=25) {
	
	System.out.println("Youngster");
	
	
	}else if 
	(age >=26 && age<=64) {
		System.out.println("adult");
	
	}else {
	
	System.out.println("senior");
		
	}
	
	return age;
	
	
	}
	
	}
	
