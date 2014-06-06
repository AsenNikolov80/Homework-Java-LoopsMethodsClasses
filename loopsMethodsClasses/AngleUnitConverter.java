package loopsMethodsClasses;

import java.util.Locale;
import java.util.Scanner;

public class AngleUnitConverter {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		float rad=0;float deg=0;double result=0;
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			float chislo = input.nextFloat();
			String type = input.next();
//			System.out.println(type);
			if (type.equals("rad")) {
				rad = chislo;
				result = radianToDegrees(rad);
				System.out.printf("%.6f deg",result);
				System.out.println();
			} else if (type.equals("deg")) {
				deg = chislo;
				result = degreesToRadians(deg);
				System.out.printf("%.6f rad",result);
				System.out.println();
			}
			
			// System.out.println(chislo);
			// System.out.println(type);
		}

	}

	public static double radianToDegrees(float rad) {
		double test = rad * 180 / Math.PI;
		return test;
	}

	public static double degreesToRadians(float deg) {
		double test = deg * Math.PI / 180;
		return test;
	}

}
