package com.abc.abstraction;

public class MultipleInheritance_ThroughInterface implements FirstInterface,SecondInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance_ThroughInterface obj= new MultipleInheritance_ThroughInterface();
		obj.add(4, 5);
	}
	//duplicate method remove karto compiler
	//jasa ithe int add duplicate hotya tar ekch add method add compiler ne add keliy 
	//mhnun total 3 paiki 2 ch method implement hotay
	
	@Override
	public int add() {
		// TODO Auto-generated method stub
		return 0;
	}
	//**** Normal Class Sarkh treat karu shakato apan hya class la
	public int add (int a, int b) {
		 System.out.println(a+b);
		 return a+b;
	}
	
	@Override
	public int sub() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
