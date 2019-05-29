package day_47MethodBlocks;

public class InitBlockTest {
	public static void main(String[] args) {
	
	InitBlock all1= new InitBlock();
	InitBlock all2 = new InitBlock();
	System.out.println(all1.nonStaticInt);
	System.out.println(all1.staticInt);
	
	System.out.println(all2.nonStaticInt);
	System.out.println(all2.staticInt);
}
}
