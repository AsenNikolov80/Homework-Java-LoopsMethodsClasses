package orderOfProducts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class Product {
	private String name;
	private double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		String filename = "src\\orderOfProducts\\products.txt";
		int numberOfLines = countLines(filename);
		Product[] productList = new Product[numberOfLines];
		productList = readFromFile(filename);// read from file products

		filename = "src\\orderOfProducts\\order.txt";
		Product[] orderlist = new Product[countLines(filename)];
		orderlist = readFromFile(filename);// read the order
		double result = calculateSum(productList, orderlist);
//		System.out.printf("%.2f",result);
		saveToFile(result);
	}

	private static void saveToFile(double result) throws IOException {
		FileWriter file=new FileWriter("src\\orderOfProducts\\output.txt");
		BufferedWriter writer=new BufferedWriter(file);
		writer.write(String.format("%.2f", result));
		writer.close();
	}

	private static double calculateSum(Product[] productList,
			Product[] orderlist) {
		double result = 0;
		for (int i = 0; i < orderlist.length; i++) {
			String novo = orderlist[i].name;
			double quantity = orderlist[i].price;
			for (Product product : productList) {
				if (product.name.contentEquals(novo)) {
					result += product.getPrice() * quantity;
				}
			}
		}

		return result;
	}

	private static Product[] readFromFile(String filename) throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader(filename));
		String[] arrayFromRows = new String[2];
		int numberOfLines = countLines(filename);
		Product[] productList = new Product[numberOfLines];
		for (int i = 0; i < numberOfLines; i++) {
			arrayFromRows = reader.readLine().split(" ");
			productList[i] = new Product(arrayFromRows[0],
					Double.parseDouble(arrayFromRows[1]));
		}
		reader.close();
		return productList;
	}

	private static int countLines(String filename) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		int count = 0;
		String line = reader.readLine();
		while (line != null) {
			count++;
			line = reader.readLine();
		}
		reader.close();
		return count;
	}

}
