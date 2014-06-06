package loopsMethodsClasses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JLabel;

public class FullHouse {

	public static void main(String[] args) {
		String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		String[] faces = { "♣", "♦", "♥", "♠" };
		int counter = 0;
		ArrayList<String> allCards = new ArrayList<String>();
		ArrayList<String> resultCards = new ArrayList<String>();
		for (int i = 0; i < cards.length; i++) {
			for (int j = 0; j < 4; j++) {
				allCards.add(cards[i] + faces[j]);// holds all cards
			}
		}
		
		for (String card1 : allCards) {
			for (String card2 : allCards) {
				for (String card3 : allCards) {
					for (String card4 : allCards) {
						for (String card5 : allCards) {
							if (card1.charAt(0) == card2.charAt(0)
									&& card2.charAt(0) == card3.charAt(0)
									&& card3.charAt(0) != card4.charAt(0)
									&& card4.charAt(0) == card5.charAt(0)) {
								if (card1.charAt(1) != card2.charAt(1)
										&& card2.charAt(1) != card3.charAt(1)
										&& card1.charAt(1) != card3.charAt(1)
										&& card3.charAt(1) != card4.charAt(1)
										&& card4.charAt(1) != card5.charAt(1)) {
									
									resultCards
											.add(card1 + " " + card2 + " "
													+ card3 + " " + card4 + " "
													+ card5);

								}

							}
						}
					}
				}
			}
		}
		Set<String> uniqueCards = new HashSet<String>(resultCards);
		Set<String> treeSet = new TreeSet<String>(uniqueCards);
//		int iterator=0;
		for (String card : treeSet) {
//			if (iterator>=20) {
//				break;
//			}
			System.out.print("(" + card + ")...");
			counter++;
//			iterator++;
		}
		System.out.println(counter);

	}
}
