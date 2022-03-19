package com.abc.MethodOverriding;

public class StaticMethodOverriding {

	public static void M1() {
		
		System.out.println("I am from Parent");
	}
	public void M2() {
		System.out.println("I am from Parent from M2");
	}
	public static void main(String[] args) {
	
	}
}

class ChildClassOverridingStaticMethod extends StaticMethodOverriding{
	
	public static void M1() {
		
		System.out.println("I am from Child");
	}
	
	public void M2() {
		System.out.println("I am from Child from M2");
	}
	
	public static void main(String[] args) {
		//Static
		
		ChildClassOverridingStaticMethod obj=new ChildClassOverridingStaticMethod();
		obj.M1(); 
		StaticMethodOverriding obj1=new StaticMethodOverriding();
		obj1.M1();
		StaticMethodOverriding obj2=new ChildClassOverridingStaticMethod();
		obj2.M1();
		
		
		//Non Static
		ChildClassOverridingStaticMethod obj3= new ChildClassOverridingStaticMethod();
		obj3.M2();
		StaticMethodOverriding obj4=new StaticMethodOverriding();
		obj4.M2();
		StaticMethodOverriding obj5= new ChildClassOverridingStaticMethod();
		obj5.M2();
		
	}
}
