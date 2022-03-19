package com.abc.StaticInterface;

public interface NewInterfaceWithStaticAndDefault {

	//Abstract Method
		void add(int a, int b); //INTERNALLY---> public abstract void add (int a, int b);

		//Default Method
		default void sub(int a, int b) {
			System.out.println(a-b);
		}
		
		//Static Method
		static void multiplication (int a, int b) {
			System.out.println("Multiplication From Class NewInterfaceWithStaticAndDefault " + (a*b));

		}
}