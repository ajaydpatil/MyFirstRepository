package com.abc.MethodOverriding;

//Return Type
//If return type of parent class method is a primitive type , then 
//child class method also have the same return type.
//otherwise lead to compilation error

class Tree {
	
	public void Taste() {
		
	}
	
	public int Height() {
		int a=14;
		return 14;
		
	}
	
	public void Leafs() {
	
	}

}

public class Mango extends Tree {
	//override- Taste
	public void Taste() { //public ch lihayla lagel visibility kami nahi karu shakat
		//return type should be same
	}
	
	public int Height() {
		int a=14;
		return 14;
	}
}