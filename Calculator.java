import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

	public static void main(String args[]) {

		// Declare Variables
		String input = "";
		int inputInt = 0;
		int num1 = 0;
		int num2 = 0;
		int result = 0;

		BufferedReader bufferedReader 
			= new BufferedReader(new InputStreamReader (System.in));

		// Print Menu
		System.out.println("Welcome to calculator!");
		System.out.println("Type '1' for addition. ");
		System.out.println("Type '2' for subtraction. ");

		// Get Selection
		try {
			input = bufferedReader.readLine();
		} catch (IOException exception) {
			System.out.println(exception);
		}

		// Convert Selection
		inputInt = Integer.parseInt(input);

		System.out.println("Enter your first number. ");

		// Get First number
		try {
			input = bufferedReader.readLine();
		} catch (IOException exception) {
			System.out.println(exception);
		}

		// Convert Selection
		num1 = Integer.parseInt(input);

		System.out.println("Enter your second number. ");

		// Get second number
		try {
			input = bufferedReader.readLine();
		} catch (IOException exception) {
			System.out.println(exception);
		}

		// Convert Selection
		num2 = Integer.parseInt(input);

		if (inputInt == 1) {
			result = num1 + num2;
			System.out.println("Your answer is:" + result);
		} else {
			result = num1 - num2;
			System.out.println("Your answer is:" + result);
		}


	}	
}	