package com.abc.methodoverloading;

public class CompileTimeMethodOverloading {

		public void add(int a, int b) {
			System.out.println("i am add with two parameter "+ (a+b));
		}
		
		public void add(int a, int b, int c) {
			System.out.println("i am add with three parameter "+ (a+b+c));
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompileTimeMethodOverloading obj= new CompileTimeMethodOverloading();
		//obj.
		// obj dot type kelyawarch aplyala kaltay ki kuthli method call honar ahe i.e. runtime madhech
		// so method binding at compile time
		// hence method overloading is called as "compile time polymorphism"
	}

}
