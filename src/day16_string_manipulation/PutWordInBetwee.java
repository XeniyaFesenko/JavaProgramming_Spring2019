package day16_string_manipulation;

public class PutWordInBetwee {
	public static void main(String[] args) {
		String chars = "{{}}";
		String word = "AUTOMATION";
		
		String result = chars.substring(0,2) + word + chars.substring(2) ; 
		System.out.println(result);
     		
	}
}
