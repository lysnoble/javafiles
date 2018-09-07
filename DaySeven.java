import java.util.Random;

/* 
  DaySeven                                 08.20.2017
  Coding Day Seven                        Mini-Starks

  Today
  - New Operators!
    == Equality Test
    || 'Or'
    && 'And'
    < Less Than
    > Greater Than
    <= Less Than or Equal To
    >= Greater Than or Equal To Operator
  - Breaking out of a Loop
    + 'return' immediately exits a method. This
      includes main (rip).
    + 'break' immediately exits a loop. 
  - Commenting Code
    + ctrl and '/' will comment highlighted
      blocks of code.
  - Arrays!
    + An arrray is a variable that contains a set
      of values of the same type.
    + When you declare an array, you must either
      assign it a list of values, or specify what
      its length will be.

*/

public class DaySeven {
	
	public static void main(String args[]) {

		// Format: Type[] variableName = new Type[length];
		String[] food = new String[5];

		// This is how we assign value to elements of an array.
		food[0] = "Banana";
		food[1] = "Oreo";
		food[2] = "Roasted Duck";
		food[3] = "Spaghetti";
		food[4] = "(He need some) Malk";

		// This is how we print each element of an array.
		for (int x = 0; x < food.length; x++) {
			System.out.println(food[x]);
		}
  }
}