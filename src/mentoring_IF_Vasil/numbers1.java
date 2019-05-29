package mentoring_IF_Vasil;

public class numbers1 {

	public static void main(String[] args) {
		int[] numbers = {421, 235, 435, 64, 547 , 63, 54, 845, 4};
		int min=findMin(numbers);
	
		System.out.println(min);
	}
		
		public static int findMin(int[] arr) {
		int min = arr[0];
		for (int i:arr) {
			if(i<min) {
				min = i;
				
			}
		}
			
		return min;
		
		}
}