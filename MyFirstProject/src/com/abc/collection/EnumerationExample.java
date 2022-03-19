package com.abc.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationExample {
public static void main(String[] args) {
		
		//Creating vector collection having name obj
		Vector<String> obj=new Vector<String>();
		//Adding some object in collection
		obj.add("First icecream");
		obj.add(1, "Second icecream");
		obj.addElement("Third icecream");
		obj.add("First icecream");
		
		System.out.println(obj);
		
		
		//If you want to retrieve objects from collection one by one we use cursors
		// ************Enumeration is one of the cursor*************
		
		
		 Enumeration<String> enumerationobj  =obj.elements();
		 System.out.println("Iteration through Enumeration interface------");
		 
		 // Enumeration is holding total four object
		 
		 while (enumerationobj.hasMoreElements()) { //Checking whether collection has element
			 System.out.println(enumerationobj.nextElement()); //if element is present then retrieve it
		 }
		 System.out.println(obj);
		 
		 
		 
		 //Another way to retrieve object one by one from collection
		 //we can use iterator method of collection interface
		 System.out.println("--------Iteration through iterator interface------");
		Iterator<String> iteratorobj=obj.iterator();
		 //Checking whether collection has element
		while(iteratorobj.hasNext()) {
			//if element is present then retrieve it
			System.out.println(iteratorobj.next());
			iteratorobj.remove(); //Remove is additional method in Iterator interface
		}
		System.out.println(obj);
		
		
	}
}
