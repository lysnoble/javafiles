import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CodingDayThree {

	public static void main(String args[]) {

		String input = "";

		// Prompt The User
		System.out.print("Enter a number! ");

		// Define our Reader
		BufferedReader bufferedReader 
			= new BufferedReader(new InputStreamReader (System.in));

		// Read Input	
		try {
			input = bufferedReader.readLine();
		} catch (IOException exception) {
			System.out.println(exception);
		}

		// Respond to Input
		if (input.equals("9")) {
			System.out.println("You entered 9");
		} else {
			System.out.println("You did not enter 9");

		}	
	}
}