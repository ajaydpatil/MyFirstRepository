package com.abc.StringPackage;

public class EqualComparasion {
	public static String var="a";
	public static String var1="a";
	public static String var2="A";
	
	public static void main(String[] args) {
		
		//== will check whether both the reference is pointing to same object
		System.out.println(var==var1);
		//equal will check whether both reference is holding same content but return type is boolean
		System.out.println(var.equals(var1));
		//compareTO will check whether both reference is holding same content but return type is int
		System.out.println(var.compareTo(var1));
		
		System.out.println(var==var2);
		System.out.println(var.equals(var2));
		System.out.println(var.compareTo(var2));
	}


}
