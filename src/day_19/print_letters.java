package day_19;

public class print_letters {
	 public static void main(String []args) {
		 String word = "Amazon"; //012345, //123456
		 
		 int idx=0;
		 System.out.println(word.charAt(idx));
		 
		 idx++;
		
		 while (idx <= word.length()) {
		 System.out.println(word.charAt(idx));
		 idx++;
		 
	 }
		 
		 //print each character in reverse order.
		 int idx2= word.length()-1;
		 while (idx2 >= 0) {
			 System.out.println(word.charAt(idx2));
			idx2 --;
		 }
		 
		 
		 
		 
}
}