package day_48Inharitance;

public class Student extends Person {

	int studentID;
	String clazz;
	String name;
	
	
	public void code(String lang) {
		
}

	public void attendClass() {
		System.out.println(name+"is attending" + clazz+ "class");
	}

}