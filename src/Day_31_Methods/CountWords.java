package Day_31_Methods;

import java.util.Arrays;

public class CountWords {
public static void main(String[] args) {
	
	/* 1) name: countWords
	      return : void
	      params/args: String sentence
	      
	      CountWords "java is fun"
	      words in this sentence [Java, is, fun}
	      number of words:
	
	
	
	*/
}

 	public static void countWords(String sentence) {
 	String [] words = sentence.split(" ");
 	System.out.println("Words in this sentencce" + Arrays.toString(words));
 	System.out.println("Number of words: " + words.length);
 	}
	
 	
 	
 	public static void googleSearchResult(String result) {
 	// split by space into array
 	String [] words = result.split(" ");
 	String count = words[1].replace(",","");
 	String sentence = words[3].replace("(", "");
 	System.out.println();
 	}



}
