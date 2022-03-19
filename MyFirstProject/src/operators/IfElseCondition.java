package operators;

public class IfElseCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To check whether number is even of odd
		
		int var1=101;
		
		if (var1%2==0) {
			//% means java will calculate remender i.e. var1%2 = 1
			//next operation 1==0 then false/ 0==0 then true
			System.out.println(var1 + " is an even number ");
			
		} 
		else {
			System.out.println(var1 + " is an odd number ");
		}
	}

}
