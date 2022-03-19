package com.constructor;

public class Constructor {

	int a;
	int b;
	boolean c;
	static int d;
	
	public Constructor() {
		
		System.out.println("I am constrctor");
		a=34;
		b=30;
		c=true;
	}
	//Discussion!!
	
	public Constructor(int a, int b) {
		System.out.println("I am parameterized constructor");
		
		this.a=a;
		this.b=b;
	
	
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj = new Constructor(10,20); // new keyword object create karto.. 
		//Constructor() responsible for initialization of an instance variable
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c); 
		
		Constructor obj1= new Constructor(5,25);
		
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.c); 
		
		

}
}

