package loopsMethodsClasses;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class SymmetricNumbersinRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lower = input.nextInt();
		int upper = input.nextInt();
		for (int i = lower; i < upper; i++) {
			int counterOfDigits = 0;
			int inside = i;
			while (inside > 0) {
				counterOfDigits++;
				inside /= 10;
			}
			
			switch (counterOfDigits) {
			case 1:
				System.out.print(i + " ");

				break;
			case 2:
				if (i % 10 == (i / 10)) {
					System.out.print(i + " ");
				}

				break;
			case 3:
				if (i % 10 == (i / 100)) {
					System.out.print(i + " ");
				}

				break;
			case 4:
				if (i % 10 == (i / 1000) && (i / 10 % 10 == i / 100 % 10)) {
					System.out.print(i + " ");
				}

				break;
			case 5:
				if (i % 10 == (i / 10000) && (i / 10 % 10 == i / 1000 % 10)) {
					System.out.print(i + " ");
				}

				break;
			case 6:
				if (i % 10 == (i / 100000) && (i / 10 % 10 == i / 10000 % 10)
						&& (i / 100 % 10 == i / 1000 % 10)) {
					System.out.print(i + " ");
				}

				break;
			default:
				break;
			}

		}

	}

}
