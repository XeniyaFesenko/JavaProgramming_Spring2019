package day32_Methods;

public class MethodsWithReturn {
public static void main(String[] args) {
	System.out.println(givesMe10$());
	int i = givesMe10$();
	System.out.println("i:"+ i);

	// returns int value
	String name = givesMeYourNmae();
	System.out.println("My name is: "+ name);

}
	
	public static int givesMe10$() {
		return 10;
		
}

	// give me your name;
	public static String givesMeYourNmae() {
		String name = "Kseniya";
	    return "Kseniya";

	

}
	}
