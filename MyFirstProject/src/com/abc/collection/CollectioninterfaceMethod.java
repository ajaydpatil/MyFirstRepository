package com.abc.collection;
import java.util.ArrayList;

public class CollectioninterfaceMethod {
	
	public static void main(String[] args) {
		
		//Creating the array list collection having name obj
		ArrayList<Object> obj=new ArrayList<Object>();
		
		//If you want to add a object then use Add method from collection interface
		//This will add the String object
		obj.add("This is String");
		obj.add(2); //this will add interger object
		
		System.out.println(obj); //It will print the collection (all object of collection obj)
		
		//Creating the another arraylist collection having name obj1
		ArrayList<Object> obj1=new ArrayList<Object>();
		obj1.add("New collection"); //This will add the String object
		System.out.println(obj1);

		//This method is used to add one collection in another collection
		obj.addAll(obj1); //obj1 collection is copied in obj collection
		System.out.println(obj); 
		
		//Remove will remove specific object
		obj.remove(1); //Remove the object from collection which is at position 1
		System.out.println(obj);
		
		//RemoveAll will remove one collection from another
		obj.removeAll(obj1); //Remove collection obj1 from collection obj
		
		System.out.println(obj);
		
		obj.clear(); //Delete all the objects from collection
		
		System.out.println(obj);
		
		obj.add(4); //0
		obj.add(25);//1
		
		System.out.println(obj);
		
		System.out.println(obj.contains(4)); //Checking whether specific object is present in collection
		
		//collection stores objects
		// objects comes non-primitive 
		// obj collection represent Object class object
		//obj.get(0)--- Integer type 
		
		Object p=obj.get(0); //Homogeneous statement 
		Integer t= (Integer) obj.get(0); //Heterogeneous  statement so converting into Integer object 
		System.out.println(t);
		
		// set 
		
		System.out.println(obj);  //4, 25  //24,25
		
		obj.set(0, 24); //Set method is used to replace object of specific index 
		//replacing object at index 0 with value 24
		System.out.println(obj);
		
		
	}

}
