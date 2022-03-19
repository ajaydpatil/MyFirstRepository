package com.abc.MethodOverriding;


public class Animal {
	public void Sound() {
		System.out.println("No Sound");
	}
	
	public void Sleep() {
		System.out.println(" I am from Parent class");
	}

}

class Dog extends Animal{
	
	public void Sound() {
		System.out.println("Bark Bark");
	}
}

class Cat extends Animal{
	
	public void Sound() {
		System.out.println("Meaw Meaw");
	}
	
	public static void main (String[] args) {
		Cat obj=new Cat();
		obj.Sound();
		obj.Sleep();
		
		
	}
}
