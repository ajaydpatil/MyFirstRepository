package operators;

public class ArithmaticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmaticOperators obj=new ArithmaticOperators();
		obj.add(2, 3);
		obj.sub(5, 3);
		obj.mul(10, 20);
		ArithmaticOperators.div(5, 2);
		ArithmaticOperators.mod(6);
		
		//Homework: Try division & Modulus in decimal ---- other also play with variables
	}
		public void add (int a, int b) {
			System.out.println("This is + operator test " + (a+b));
		}
		public void sub (int a, int b) {
			System.out.println("This is - operator test " + (a-b));
		}
		public void mul (int a, int b) {
			System.out.println("This is * operator test " + (a*b));
		}
		//try decimal in homework
		// why 2? not 2.5? cause int---- fakt a la jari float kel tari 2.5 ka yetay ans 2.5?
		public static void div (int a, int b) {
			System.out.println("This is / operator test " + (a/b));
		}
		// Just shows remender
		//try decimal
		public static void mod (int a) {
			System.out.println("This is % operator test " + (a%2));
		}
	}


