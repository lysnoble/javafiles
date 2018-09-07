import java.util.Random;


public class BarGraph {
	public static void main(String args[]); {

	int[] occurences = new int[20];


	for (int x = 0; x < occurences.length ; x++) {
			occurences[x] = generateNumber();
		}


public static int generateNumber() {

		Random generator = new Random();

		return generator.nextInt(50);
	}
}