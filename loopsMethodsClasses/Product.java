package loopsMethodsClasses;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

import javax.sound.sampled.Line;

public class Product {
	private String name;
	private Double price;

	public Product(String string, Double i) {
		this.name = string;
		this.price = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader;
		String fileName = "D:" + File.separator + "eclipse" + File.separator
				+ "workplace" + File.separator + "LoopsMethodsClasses"
				+ File.separator + "src" + File.separator
				+ "loopsMethodsClasses" + File.separator + "input.txt";
		try {
			reader = new BufferedReader(new FileReader(fileName));

			int numLines = countLines(fileName);// number of rows in file
			Product[] productList = new Product[numLines];
			String[] arrayFromRow = new String[2];
			String line = reader.readLine();
			double price1 = 0;
			int i = -1;
			while (line != null) {
				i++;
				arrayFromRow = line.split(" ");
				line = arrayFromRow[0];
				price1 = Double.parseDouble(arrayFromRow[1]);
				productList[i] = new Product(line, price1);
				line = reader.readLine();

			}
			reader.close();
			productList = sort(productList);
			toFile(productList);
		} catch (FileNotFoundException e) {
			System.out.println("Error");

		}

	}

	private static void toFile(Product[] productList) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(
					".\\src\\loopsMethodsClasses\\result.txt"));
			for (int i = 0; i < productList.length; i++) {
				writer.write(String.format("%.2f %s",
						productList[i].getPrice(), productList[i].getName()));
				writer.newLine();
			}
			writer.close();
		} catch (IOException e) {
			System.out.println("Can't write to file");
		}

	}

	private static Product[] sort(Product[] productList) {
		String name = productList[0].getName();
		double price = productList[0].getPrice();
		Product swap = new Product(name, price);
		boolean swapped = true;
		int n = productList.length;
		while (swapped) {
			swapped = false;
			for (int i = 1; i < n; i++) {
				if (productList[i].getPrice() < productList[i - 1].getPrice()) {
					swap.setName(productList[i - 1].getName());
					swap.setPrice(productList[i - 1].getPrice());
					productList[i - 1].setName(productList[i].getName());
					productList[i - 1].setPrice(productList[i].getPrice());
					productList[i].setName(swap.getName());
					productList[i].setPrice(swap.getPrice());
					swapped = true;
				}
			}
			n--;
		}
		return productList;

	}

	private static int countLines(String fileName) throws IOException {
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		int counter = 0;
		while (line != null) {
			counter++;
			line = br.readLine();
		}
		br.close();
		return counter;
	}
}
