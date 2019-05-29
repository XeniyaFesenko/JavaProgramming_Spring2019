package day30_methods02;
import java.util.*;
public class MyNumbers {
public static void main(String[] args) {
	
	showMe5Numbers();
	
	doPush100Ups();
	rangePrint();
	

}
 public static void showMe5Numbers() {
	
	Random r = new Random();

	for (int i = 0; i < 5; i++) {
	System.out.println(r.nextInt(1001)+" ");
	System.out.println();
}

 }
	
	
	//name: doPush100Ups
	//return type: void
	//params: no
	
	//PushUp 1
	//PushUp 2
	//PushUp3
	//..i
	//Pushup 10
	//time to rest
	
	public static void doPush100Ups() {
	
	for( int j = 1; j <=10; j++) {
		System.out.println("Push up -"+ j );
		
	}
	System.out.println("Time to rest");
	
	}
	public static void rangePrint() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 2 numbers:");
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	
	if (num1 < num2) {
		for (int i = num1; i <= num2; i++) {
	System.out.println(i + " ");
		}
	}else if(num1 >num2) {
		for (int k= num1; k >=num2; k--) {
			System.out.println(k+ " ");
		}
	}else {
		System.out.println(num1);
	
	
	}
	
}
}
