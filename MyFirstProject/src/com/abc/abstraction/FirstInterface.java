package com.abc.abstraction;
//<Am><INterface><Indentifier>

public interface FirstInterface {

	//int a; //Interface madhe declare karaylach lagat
	
	int a=10;
	//*****compiler--->> public static final int a=10;
	// Interface only support static variable 
	//Protected int b; AM nehmi public asel illegal  to use
	//by defauult only public access modifier is allowed
	
	
	int add();
	 //public abstract void add
	//No need to add abstract keyword
	
	int sub();
	
	//******Compiler---->> static void test();
	//karan default to public abstract gheto
	//interface only support instance method
}
