public class Euler {
	public static void main(String args[]) {

		int sum = 0;

		for (int x = 1; x < 1000; x++) {
			
			if (isMultipleOfThree(x) || isMultipleOfFive(x)) {
				sum = sum + x;
			}
		}

		System.out.println(sum);

	}

	public static boolean isMultipleOfThree(int number) {

		boolean multipleOfThree = false;
		double doubleResult = ((double) number) / 3;
		int intResult = number / 3;

		if (doubleResult == (double) intResult) {
			multipleOfThree = true;

		}

		return multipleOfThree;

	}

	public static boolean isMultipleOfFive(int number) {

		boolean multipleOfFive = false;
		double doubleResult = ((double) number) / 5;
		int intResult = number / 5;

		if (doubleResult == (double) intResult) {
			multipleOfFive = true;

		}

		return multipleOfFive;

	}
}