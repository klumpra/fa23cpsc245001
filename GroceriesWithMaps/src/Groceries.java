import java.util.LinkedHashMap;
import java.util.Scanner;
import java.io.File;
public class Groceries {
	public static void main(String[] args) {
		String filename;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of file: ");
		boolean success = false;
		filename = sc.nextLine();
		LinkedHashMap<String,Double> groceries = new LinkedHashMap<String,Double>();
		String line;
		String[] parts;
		String name;
		double price;
		try {
			Scanner fsc = new Scanner(new File(filename));
			while (fsc.hasNextLine()) {
				line = fsc.nextLine().trim();
				if (line.length() == 0) {
					continue;
				}
				parts = line.split("\t");
				name = parts[0];
				price = Double.parseDouble(parts[1]);
				groceries.put(name, price);
			}
			fsc.close();
			success = true;
		} catch (Exception ex) {
			System.out.println("Could not read the file.");
			success = false;
		}
		if (!success) {
			System.out.println("Cannot continue.");
			return;
		}
		String searchFor;
		do {
			System.out.print("Enter name of item or q to quit: ");
			searchFor = sc.nextLine();
			if (!searchFor.equals("q")) {
				if (groceries.containsKey(searchFor)) {
					price = groceries.get(searchFor);
					System.out.printf("Item %s costs $%.2f.\n", searchFor,price);
				} else {
					System.out.println("That item is not in stock.");
				}
			}
		} while (!searchFor.equals("q"));
		System.out.println("Thank you for shopping.");
	}
}
