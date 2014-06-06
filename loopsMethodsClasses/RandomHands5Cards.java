package loopsMethodsClasses;

import java.util.Random;
import java.util.Scanner;

public class RandomHands5Cards {

	public static void main(String[] args) {

		String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		String[] faces = { "♣", "♦", "♥", "♠" };
		String result = "";
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				String test="";
				do {
					test = generateCard(cards, faces);
				} while (result.contains(test));

				result += test + " ";

			}
			System.out.print(result);
			result = "";
			System.out.println();
		}
	}

	public static String generateCard(String[] cards, String[] faces) {
		String resultString = "";
		Random cardGenerator = new Random();
		int card = cardGenerator.nextInt(13);
		Random faceGenerator = new Random();
		int face = faceGenerator.nextInt(4);

		switch (card) {
		case 0:
			resultString += String.valueOf(cards[card]);
			break;
		case 1:
			resultString += String.valueOf(cards[card]);
			break;
		case 2:
			resultString += String.valueOf(cards[card]);
			break;
		case 3:
			resultString += String.valueOf(cards[card]);
			break;
		case 4:
			resultString += String.valueOf(cards[card]);
			break;
		case 5:
			resultString += String.valueOf(cards[card]);
			break;
		case 6:
			resultString += String.valueOf(cards[card]);
			break;
		case 7:
			resultString += String.valueOf(cards[card]);
			break;
		case 8:
			resultString += String.valueOf(cards[card]);
			break;
		case 9:
			resultString += String.valueOf(cards[card]);
			break;
		case 10:
			resultString += String.valueOf(cards[card]);
			break;
		case 11:
			resultString += String.valueOf(cards[card]);
			break;
		case 12:
			resultString += String.valueOf(cards[card]);
			break;

		}
		switch (face) {
		case 0:
			resultString += String.valueOf(faces[face]);
			break;
		case 1:
			resultString += String.valueOf(faces[face]);
			break;
		case 2:
			resultString += String.valueOf(faces[face]);
			break;
		case 3:
			resultString += String.valueOf(faces[face]);
			break;

		}
		return resultString;

	}

}
