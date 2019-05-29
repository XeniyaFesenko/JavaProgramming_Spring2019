package day50_inharitance03;

public class SearchEngine {

	 public int search (String item) {
		 System.out.println("Searching for: " + item);
		 int resultCount = item.length();
		 return resultCount;
		 
	 
	 }
	public void search(String item, String item2) {
		System.out.println("Searching for 2 items:" + item + ",");
		int resultCount = item.length();
		System.out.println("Total count: " + resultCount);
		
	}
	
	String clickResult() {
	System.out.println("Clicking result");
	return "Search result page";
	
	
	
	}
	
}
