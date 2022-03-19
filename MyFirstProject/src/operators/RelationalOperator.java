package operators;

public class RelationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RelationalOperator obj=new RelationalOperator();
		obj.equalto(5, 5);
		RelationalOperator.notequalto(6, 5);
		RelationalOperator.greaterthan(6, 1);
		obj.lessthan(0, 11);
		obj.greaterthanorequalto(10, 10);
		obj.lessthanorequalto(10, 10);
		
		
	}
	public void equalto (int a, int b) {
		System.out.println(" a is equals to b? " + (a==b));
		
	}
	public static void notequalto (int a, int b) {
		System.out.println(" a not equal to b? " + (a!=b));
		
	}
	public static void greaterthan (int a, int b) {
		System.out.println(" a is greater than b? " + (a>b));
	}
	public void lessthan (int a, int b) {
		System.out.println(" a is less than b? " + (a<b));
		
	}
	public void greaterthanorequalto (int a, int b) {
		System.out.println(" a greater than or equal to b? " + (a>=b));
		
	}
	public void lessthanorequalto (int a, int b) {
		System.out.println(" a less than or equal to b? " + (a<=b));
	}
}