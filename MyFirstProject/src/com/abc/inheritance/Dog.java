package com.abc.inheritance;

public class Dog extends Animal {
	
	Dog (){
		this(45); //(step2)
		//super();
		System.out.println("I am from Dog Constructor");
	}
	
	Dog (int a){
		super(45615); //(step3)
		this.a=a; //(step5) a=45
	
		System.out.println("I am from Para Dog Constructor");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog abc =new Dog(); //(step1)
		System.out.println(abc.a); //(step2)
	
	}

}
