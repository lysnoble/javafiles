import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

	public static void main(String args[]) {


		String input = "";

		BufferedReader bufferedReader 
			= new BufferedReader(new InputStreamReader (System.in));


		System.out.println("1.Print Name ");
		System.out.println("2.Print Date ");
		System.out.println("3.Print Number ");
		
		try {
			input = bufferedReader.readLine();
		} catch (IOException exception) {
			System.out.println(exception);
		}

		if (input.equals("1")) {
			System.out.println("Hugh Jazz");
		} else {
			if (input.equals("2")) {
				System.out.println("January 1st, 2000");
			 } else	{
				if (input.equals("3")) {
					              System.out.println("numbers aren't real. "); 
				}
			}
		}	
	}
}