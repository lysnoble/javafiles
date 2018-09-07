import java.util.Random;


public class Scores {
	public static void main(String args[]) {

		// initialize variables
		int[] scores = new int[1000];
		int total = 0;
		double mean = 0;

		// generate random scores
		for (int x = 0; x < scores.length; x++) {
			scores[x] = generateScores();
		}

		// math
		for(int x = 0; x < scores.length; x++) {
			total = total + scores[x];
		}

		// mean
		mean = (double) total / (double) scores.length;

		// print stuff
		for(int x = 0; x < scores.length; x++) {
			System.out.println(scores[x]);
		}

		System.out.println("The average is: " + mean);

	}

public static int generateScores() {

		Random generator = new Random();

		return generator.nextInt(100 - 50) + 50;
	}
}
