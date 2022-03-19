package operators;

public class IFELSEIFinmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFELSEIFinmethod obj=new IFELSEIFinmethod();
		obj.M1(10);
	}
	// we can also write in other method like M1
	
	public void M1 (int a) {
		if (a<=10) {
			System.out.println("I am less than or equal to 10");
		} else if (a>10 && a<20) {
			System.out.println("I am greater than 10 but less than 20");
		} else {
			System.out.println("I am greater than 20 ");
		}
	}

}
