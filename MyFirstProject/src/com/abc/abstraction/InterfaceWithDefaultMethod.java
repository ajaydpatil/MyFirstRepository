package com.abc.abstraction;

public interface InterfaceWithDefaultMethod {
	//No error for implimentation as we use default keyword 
	//if you use access modifier ;error yeil
	
	default void DefaultMethod() { //AM default Public; default alyawar abstract nahii taknar
		System.out.println("I am Default Method interface without Parameter");
	}
	
	//
	//Even interface supports implementation ; your access modifier should be always public
	public default void DefaultMethod(int a) {
		System.out.println("I am Default Method");
	}
}