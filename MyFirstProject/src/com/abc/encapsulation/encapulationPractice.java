package com.abc.encapsulation;

public class encapulationPractice {
	private int AccountNum=101,a,b,c;
	
	
	
	public int getA() {
		return a;
	}



	public void setA(int a) {
		this.a = a;
	}



	public int getB() {
		return b;
	}



	public void setB(int b) {
		this.b = b;
	}



	public int getC() {
		return c;
	}



	public void setC(int c) {
		this.c = c;
	}



	public int getAccountNum() {
		return AccountNum;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encapulationPractice abc=new encapulationPractice();
		abc.setA(100);
		System.out.println(abc.getA());
		abc.setB(45);
		System.out.println(abc.getB());
		System.out.println(abc.getAccountNum());
		
		

	}

}
