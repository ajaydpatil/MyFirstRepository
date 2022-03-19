package com.abc.abstraction;

public class ClassInterfaceWithDefault implements InterfaceWithDefaultMethod,AnotherInterfaceWithDefault{

		//As methods were already implemented no error to ask for implementation
		//if we add method without default then error will occur to this class
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassInterfaceWithDefault obj= new ClassInterfaceWithDefault();
		obj.DefaultMethod();
		//obj.DefaultMethod(10);

	}

		@Override
		public void DefaultMethod() {
			// TODO Auto-generated method stub
			AnotherInterfaceWithDefault.super.DefaultMethod();
		//System.out.println("I AM FROM CLASS");
		}

}
