package day_38ArrayList;
import java.util.ArrayList;
public class RawArrayList {
	public static void main(String[] args) {
		
	
	ArrayList list = new ArrayList();
	list.add("Saturday");
	list.add("Java day");
	list.add(1000);
	list.add(234.4);
	list.add(true);
	list.add(false);
	
	System.out.println(list); //automatically call toString();
	String allValues=list.toString();
	System.out.println(allValues);
	
	String str = list.get(0).toString();
	System.out.println(str);
	//All values are stored as a raw type.
	//as a general
	

	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
