package com.abc.MethodOverriding;

   
 class Parent {

	public void Bike() {
		System.out.println("I am from Parent Bike Class");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

public class Son extends Parent {
	
	public void Bike() {
		System.out.println("I am from Son Bike Class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son obj=new Son();
		obj.Bike();
	}

}
