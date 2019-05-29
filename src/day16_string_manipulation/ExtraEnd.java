package day16_string_manipulation;

public class ExtraEnd {
	public static void main(String[] args) {
		String str1 = "one";
		String str2 = "two";
		String result = "";
//		if(str.length() == 3) {
//			result = str+str+str;
//		}else {
//			result = str.substring( str.length() -3 );
//			result = result + result + result;
//		}
		
		
		result = str1.substring( str1.length() -2 );
	    result = result + result + result;
		
		
		System.out.println(result);
		
	}

}
