package day33_methods;

public class PayCalculator {
	
	public static void main(String[] args) {
		
		int pay = getHourlyPay(40,50);
		System.out.println("Toatal pay for 40 hours: " +pay);
		System.out.println(getHourlyPay(0,10));
	}
	
	
	
	
	 public static int getHourlyPay(int hours, int rate) {
		 if(hours<=0) {
			 System.out.println("Invalid Hours!");
		 }
	     
		 if(rate <= 0) {
			 System.out.println("Invalid rate!");
			 return 0;
		 }
	    
	    	int totalPay = hours * rate;
	    	return totalPay;
	
	 
	    	
	    	
	 }
	}
		

