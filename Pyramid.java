import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	public class Pyramid {


	public static void main(String args[]) {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader (System.in));
		String userInput = "";
		int pyramidHeight = 41;

		System.out.println("Enter your pyramid height: ");

		try {
			userInput = bufferedReader.readLine();
		} catch (IOException exception) {
			System.out.println(exception);
		}

		pyramidHeight = Integer.parseInt(userInput);
		displayPyramid(pyramidHeight);

	}

	public static void displayPyramid(int height) {

			for (int layer = 1; layer < (height + 1); layer++) {

			int layerWidth = layer + (layer - 1);
			int layerSpaces = height - (layer - 1);

			for (int space = 1; space < layerSpaces + 1; space++) {
			System.out.print(" ");
			}

			for (int width = 1; width < layerWidth + 1; width++) {
			System.out.print("W");
			}

			System.out.println();
		}

	}
}