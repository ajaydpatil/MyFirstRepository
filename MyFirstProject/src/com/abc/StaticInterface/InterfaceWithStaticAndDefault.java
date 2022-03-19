package com.abc.StaticInterface;

public interface InterfaceWithStaticAndDefault {

	//Abstract Method
	void add(int a, int b); //INTERNALLY---> public abstract void add (int a, int b);

	//Default Method
	//Default cha implementation INTERFACE maddhecch karayla lagel
	default void sub(int a, int b) {
		System.out.println("Sub from InterfaceWithStaticAndDefault " +(a-b));
	}
	
	//Static Method
	static void multiplication (int a, int b){
	System.out.println(a*b);
	}
}
