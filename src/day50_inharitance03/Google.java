package day50_inharitance03;

public class Google extends SearchEngine {

	@Override
	 public int search (String item) {
		 System.out.println("Searching for: " + item);
		 int resultCount = item.length();
		 return resultCount;
		 
	 
	 }
	public void search(String item, String item2) {
		System.out.println("Searching for 2 items:" + item + ",");
		int resultCount = item.length()+ item2.length();
		System.out.println("Total count: " + resultCount);
		
	}
	
	
	
}
