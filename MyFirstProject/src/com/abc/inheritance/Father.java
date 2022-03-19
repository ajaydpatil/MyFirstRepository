package com.abc.inheritance;

class GrandFather{
	
	public void Car() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am Grandfather Class");
		
	}

}

public class Father extends GrandFather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am father class");
	}
}

class child extends Father{
	//Can I define more than one public class in a Java package?
	//while defining multiple classes in a single Java file you need to make sure that only one class among them is public. If you have more than one public classes a single file a compile-time error will be generated.
	
}

