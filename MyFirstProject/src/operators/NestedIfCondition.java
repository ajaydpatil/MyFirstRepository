package operators;

public class NestedIfCondition {
	// In nested operator if First condition is true then only second condition is checked!
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//--------BLOOD DONATION--------
		//TWO VARIABLES WE REQUIRE
		//AGE >=18 WEIGHT>50
		
		int age=18;
		int weight =53;
		
		if(age>=18) {
			
			if(weight>50) {
				System.out.println("You can donate the blood");
			} else {
				System.out.println("You are underweight");
			}
			
		} else {
			System.out.println("Your age is below 18");
		}
				
	}

}
