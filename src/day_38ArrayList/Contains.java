package day_38ArrayList;
import java.util.*;
public class Contains {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Jan");
        list1.add("Feb");
        list1.add("Mar");
        list1.add("Apr");
        list1.add("May");
        System.out.println(list1.toString());
        ArrayList<String> list2 = list1;//list1, list2 point to same object 
        //copy all values from list1
        ArrayList<String> months = new ArrayList<>(list1);
        System.out.println(months);
        months.add("Jun");
        months.add("Jul");
        months.add("Aug");
        System.out.println(months.contains("Jan"));
        System.out.println(months.contains("Dec"));
        //how would you check if february in second position
        System.out.println(months.indexOf("Feb")==1);
        System.out.println(months.get(1).equals("Feb"));
        
        ArrayList<String> month2 = new ArrayList<>(list1);
       System.out.println("Month2:" + month2.toString());
       // check if month has all the values of Month2
    
       //add one more Jan to Month2
       
    month2.add("Jan");
       if (months.containsAll(month2)) {
       System.out.println("Months has all of Months2");
    }else {
    	System.out.println("Some values are missing");
    	
        
    }
}
}
