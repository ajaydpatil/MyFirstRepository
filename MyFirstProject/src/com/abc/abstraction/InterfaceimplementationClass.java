package com.abc.abstraction;

//You need to use implement keyword when trying to extend interface
//Compiler will give error to provide implementation for abstract method from interface

public class InterfaceimplementationClass implements FirstInterface {

	public static void main(String[] args) {
		
		InterfaceimplementationClass abc= new InterfaceimplementationClass();
		abc.add();
		abc.sub();
		//Variable use
		System.out.println(InterfaceimplementationClass.a);
		//System.out.println(a); asa pn chalel karan variable static ahe
		

	}

	@Override
	//Non Static/ Instance Method
	public int add() { //FirstInterference madhe public nahi lihilay tari error nahi karan fakt public methodch
		// TODO Auto-generated method stub
		System.out.println("I am add method of Interface");
		return 0;
	}

	@Override
	//Non Static/ Instance Method
	public int sub() {
		System.out.println("I am sub method of Interface");
		// TODO Auto-generated method stub
		return 0;
	}

}
