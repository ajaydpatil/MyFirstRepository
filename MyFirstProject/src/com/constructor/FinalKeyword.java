package com.constructor;

public class FinalKeyword {

		//Final Keyword use
	//1) Instance ==> Two ways of initialization
	public final float pi; //=3.14f; 
	//2) Static Variable
	public static final int p;
	
	
	FinalKeyword() {
		pi=3.14f;
		System.out.println("I am Constructor Block");
		//p=7; Static variable not possible in constructor as constructor calls through an object only
	}
	
	static {
		System.out.println("I am Static Block 3");
	}
	
	static {
		System.out.println("I am Static Block");
		p=3;
	}
	
	static {
		System.out.println("I am Static Block 2");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalKeyword obj=new FinalKeyword();
		
		//obj.pi=45; uncomment and see the error
		System.out.println(obj.pi);
		
	}

}
