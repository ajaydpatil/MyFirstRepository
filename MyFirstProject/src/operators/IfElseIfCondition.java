package operators;

public class IfElseIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		//requirement: Print the massage as I am less than 10
		// Print the message as I am greater than 10 but less than 20
		// Print the message as I am greater than 20
		// concept boundary value analysis from manual 
		if (a<=10) {
			System.out.println("I am less than or equal to 10");
		} else if (a>10 && a<20) {
			System.out.println("I am greater than 10 but less than 20");
		} else {
			System.out.println("I am greater than 20 ");
		}
	}

}
