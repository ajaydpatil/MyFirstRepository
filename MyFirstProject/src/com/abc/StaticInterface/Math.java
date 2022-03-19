package com.abc.StaticInterface;

public class Math implements InterfaceWithStaticAndDefault, NewInterfaceWithStaticAndDefault {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math obj=new Math();
		obj.add(4, 9);
		obj.sub(10, 5);
		obj.multiplication(4, 2);
		//Static Interface chya navanech fakt call hote
		NewInterfaceWithStaticAndDefault.multiplication(4,10);
	}

	@Override
	//Both Interface is having same abstract method but while implementing we need to have only one implementation
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Addition " + (a+b) );
	}

	@Override
	//As both Interface is having same default method to resolve method ambiguity ;java force us to mention which interface we have to call
	
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		InterfaceWithStaticAndDefault.super.sub(a, b);
		//swatach logic pn lihu shakto apan jar kuthlya eka INTERFACE chi sub method nasel ghyaychi
		//InterfaceWithStaticAndDefault.super.sub(a, b); yachya jagi apal logic
	}
	static void multiplication (int a, int b){
		System.out.println("Multiplication from CLASS METHOD ITSELF  "+ (a*b));
		}
	
	
}
