package Day_23_Array;
import java.util.*;
public class Print_outWord {
	public static void main(String [] args) {
	Scanner scan = new Scanner(System.in);
    
	String allWords = "";
	String word= "";
   
    
    for (int i = 0;i<6;i++) {
        System.out.println("Type the word");
        word = scan.next();
        if(word.contentEquals("java")) {
            continue;
            
        }
        allWords+=word+", ";
    }
System.out.println("All words: "+allWords);
}
}

