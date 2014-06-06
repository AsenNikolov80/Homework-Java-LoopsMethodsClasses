package loopsMethodsClasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

public class SumNumbersFromTextFile {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("D:" + File.separator
					+ "eclipse" + File.separator + "workplace" + File.separator
					+ "LoopsMethodsClasses" + File.separator + "src"
					+ File.separator + "loopsMethodsClasses" + File.separator
					+ "input-sum.txt"));

			ArrayList<Integer> chisla = new ArrayList<>();
			String line = reader.readLine();
			while (line != null) {
				chisla.add(Integer.parseInt(line));
				line = reader.readLine();
			}
			reader.close();
			int result = 0;
			for (Integer digit : chisla) {
				result += digit;
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			System.out.println("Error");
		}
	}

}
