package com.abc.inheritance;

class Vehicle{
	
	public void Speed() {
		System.out.println("I am from Vehicle Class");
	}
}

class Car{
	
	public void Speed() {
		System.out.println("I am from Car Class");
	}
}

public class MultiLevelInterface extends Vehicle {
	public void CarType() {
		System.out.println("Jeep Compass");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevelInterface obj=new MultiLevelInterface();
		obj.CarType();
		obj.Speed();
		System.out.println();
	}
}
