package com.abc.abstraction;

public interface AnotherInterfaceWithDefault {

	default void DefaultMethod() { //AM default Public; default alyawar abstract nahii taknar
		System.out.println("I am Default Method FROM ANOTHER INTERFACE interface without Parameter");
	}
}
