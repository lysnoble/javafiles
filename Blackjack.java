import java.util.Random; 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Blackjack {
	
	public static void main (String args[]) {


		int dealerCard1 = generateNumber();
		int dealerCard2 = generateNumber();
		int playerCard1 = generateNumber();
		int newCard 	= generateNumber();
		int playerTotal = playerCard1;
		int dealerTotal = dealerCard1 + dealerCard2;
		String userChoice = "";

		System.out.println("New Game Started!\n");
		System.out.println("Dealer's First Card: " + dealerCard1 + " and a faced down card.");
		System.out.println("Your First Card: " + playerCard1 + ". Your total is now: " + playerCard1);
		System.out.print("Hit or Stay? :");

		userChoice = getUserInput();

		while(userChoice.equals("hit")) {
			newCard = generateNumber();
			playerTotal = playerTotal + newCard;
			if (playerTotal < 10)
			System.out.println("You got a : " + newCard + ". Your new total is: " + playerTotal);
			System.out.println("Hit or Stay?");


		}

		if (userChoice.equals("stay")) {
			System.out.println("You have stayed. Your final total is :" + playerTotal);
			System.out.println("Dealer reveals his faced down card. It is a " + dealerCard2 + ". Dealer's final total is :" + dealerTotal);
			if (playerTotal > dealerTotal && playerTotal < 10 || playerTotal == 10) {
				System.out.println("You have won! Congrats!");
			} else {
				System.out.println("You have lost! Better luck next time.");
			}
	}
}

public static String getUserInput() {

	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String userChoice = "";

	try {
				userChoice = reader.readLine();
			} catch (IOException exception) {
				System.out.println(exception);
			}

	return userChoice;		
}

public static int generateNumber() {

		Random generator = new Random();

		int randomNumber = generator.nextInt(6) + 1;

		return randomNumber;
	}
}