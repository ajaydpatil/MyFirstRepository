package operators;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// & Operator
		System.out.println("-----------------------AND Operator-----------------------");
		System.out.println("Both conditions are true so final result is "+ (5<6 && 6>3));
		
		System.out.println("First condition is false so final result is  "+ (10<6 && 6>3));
		//when in and operator if first condition is false then java do not check the second condition and result is false
		
		System.out.println("both conditions are false hence final result is "+ (10<6 && 6>10));
		
		System.out.println("second condition is false so final result is false "+ (5<6 && 6>10));
		
		
		//or operator
		System.out.println("-----------------------OR Operator-----------------------");
		System.out.println("Both conditions are true so final result is "+ (5<6 || 6>3));
		
		System.out.println("First condition is false so final result is  "+ (10<6 || 6>3));
		//when in or operator if first condition is false then java check the second condition
		
		System.out.println("both conditions are false hence final result is "+ (10<6 || 6>10));
		
		System.out.println("second condition is false so final result is false "+ (5<6 || 6>10));
		//if first condition is true the java do not check second condition
	
	}
	

}
