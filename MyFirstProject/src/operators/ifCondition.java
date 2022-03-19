package operators;

public class ifCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var=26;
		int var1=35;
		//or operator one condition satisfied
		//if condition satisfied then only the block get print otherwise not executed
		if (var<30 || var>27 && var1<40 ) {
			System.out.println("Im inside the loop");
		}
		System.out.println("Im outside the loop");
	}

}

//what is dead code?
//boolean x = true;
//if (x) {
//   // do something
//} else {
   // this is dead code!
//}
