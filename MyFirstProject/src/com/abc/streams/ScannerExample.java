package com.abc.streams;


	import java.util.Scanner;

	public class ScannerExample {

		// To take value from console
		
		public static void main(String[] args) {

			System.out.println("Please let me know which value i need to check for odd/even");
			//Scanner object is created and specific that we are using input stream to read value from console
			Scanner obj=new Scanner(System.in);
			int var=obj.nextInt(); //nextInt method will aspect the interger value
			if(var%2==0) {
				System.out.println(var + " Number is even ");
			} else {
				System.out.println(var + " Number is odd ");
			}
			
			/*
			 * System.out.println("Please enter string value "); 
			 * String var3=obj.next(); // Next method will only accept single word 
			 * System.out.println(var3);
			 */
			 
			System.out.println("Please enter string value for NextLine ");
			
			
			String var4=obj.nextLine(); // It will accept complete line 
			System.out.println(var4);
			
			
		}

}
