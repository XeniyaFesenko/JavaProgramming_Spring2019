package Day_23_Array;

public class Arrays_1 {
	public static void main(String[] args) {
	
				
				int[] numbers = new int[3];
				    int num1 = 5;
				    int num2 = 7;
				    int num3 = 10;
				    // assign to the first element in the array value of num1
				    numbers[0] = num1;
				    numbers[1] = num2;
				    numbers[2] = num3;
				    
				    numbers[0] = 7;
				    numbers[1] = 8;
				//   we cannot provide different data type, we have to use data type of an array
				//   numbers[2] = "A";
				    
				    System.out.println(numbers[0]);
				    System.out.println(numbers[1]);
				    System.out.println(numbers[2]);
				    System.out.println("*****************");
				    for (int i = 0; i < numbers.length; i++) {
				      System.out.println(numbers[i]);
				    }
					
				    
				    String[] names = new String[5];
				    String[] names2 = {"Bill", "Roman", "Vlad", "Burak", "Maria"};
				    System.out.println(names2[5]);
				    System.out.println("Number of items;" +names2.length);
				    String[] countries= {};
				    double[]value;
				    //double[]values = 
	
	
	
	
	}
}