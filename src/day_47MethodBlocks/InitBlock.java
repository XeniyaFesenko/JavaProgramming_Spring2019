package day_47MethodBlocks;

public class InitBlock {
	public char[] staticInt;
	public char[] nonStaticInt;

	{
		
		System.out.println("Init Block");
		
	}
	
	public InitBlock() {
		System.out.println("Constructor");
	}



}
