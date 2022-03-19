package operators;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator obj=new UnaryOperator();
		obj.Positive1(-5);
		obj.Positive2(5);
		obj.Neegative1(10);
		obj.Negative2(-10);
		obj.Increment(20);
		obj.decrement(20);
		obj.booleanop(false);
		

	}
	private void Positive1 (int a) {
		System.out.println("I am an operator to represent positive value "+ (+a));
		//- & + is minus so the output is -5
	}
	private void Positive2 (int a) {
		System.out.println("I am an operator to represent positive value "+ (+a));
		//+ & + is plus so the output is 5
	}
	private void Neegative1 (int a) {
		System.out.println("I am an operator to represent negative value "+ (-a));
		
	}
	private void Negative2 (int a) {
		System.out.println("I am an operator to represent Negative value "+ (-a));
		//- - = +
	}
	private void Increment (int a) {
		System.out.println("I am an operator to represent increment "+ (++a));
		//- - = +
	}
	private void decrement (int a) {
		System.out.println("I am an operator to represent decrement "+ (--a));
		//- - = +
	}
	private void booleanop (boolean a) {
		System.out.println("I am an not operator "+ (!a));
		//- - = +
	}
}
