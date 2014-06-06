package loopsMethodsClasses;

import java.util.Scanner;

public class Generate3LetterWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] inputString = input.next().toCharArray();
		if (inputString.length == 1) {
			System.out.printf("%s%s%s", inputString[0]);

		} else {
			for (int i = 0; i < inputString.length; i++) {
				for (int j = 0; j < inputString.length; j++) {
					for (int j2 = 0; j2 < inputString.length; j2++) {
						System.out.printf("%s%s%s ", inputString[i],
								inputString[j], inputString[j2]);
					}
				}
			}
		}

	}

}
