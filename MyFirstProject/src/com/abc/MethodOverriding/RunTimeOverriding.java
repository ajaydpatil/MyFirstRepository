package com.abc.MethodOverriding;


public class RunTimeOverriding {
	public void add (int a, int b) {
		System.out.println("  I am from Parent " + (a+b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}

class childclass extends RunTimeOverriding {
	public void add (int a, int b) {
		System.out.println("  I am from Child " + (a+b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	childclass obj=new childclass();
	obj.add(3, 4);
	RunTimeOverriding obj1= new RunTimeOverriding();
	obj1.add(5, 6);
	RunTimeOverriding obj2= new childclass();
	obj2.add(6, 7);// Parent Class add
	//obj2 dot type kelyawar Parent class chi add method dakhwleli 
	//but runtime madhe child class method call keli 
	//karan object child class cha ahe 
	
	//explicit non primitive casting
	//childclass obj3 = new RunTimeOverriding();
	//but we can do it like following which is giving RUNTIME ERROR
	//childclass obj3 = (childclass) new RunTimeOverriding(); error; cast class exception
	childclass obj3 = (childclass) obj2;// obj2 reference of parent and pointing toward childclass*** kind of downcasting
	obj3.add(10, 4); 
	
	}

}

