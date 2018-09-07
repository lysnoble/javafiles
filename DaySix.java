import java.util.Random;


public class DaySix {
	
	public static void main(String args[]) {

		generateNumber();

	}

public static void generateNumber() {

		Random generator = new Random();

		int randomNumber = generator.nextInt(50);

		System.out.println("Our random number: " +randomNumber);

	}
}