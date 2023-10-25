/*
 * manages a shopping list using parallel lists - one for items and the other for prices
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
public class Groceries {
	public static void printGroceries(ArrayList<String> names, ArrayList<Double> prices) {
		System.out.println("Here is the full list of groceries: ");
		for (int i = 0; i < names.size(); i++) {
			System.out.printf("%-15s%10.2f\n", names.get(i), prices.get(i));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String filename;
		System.out.print("Enter the name of the file of groceries: ");
		filename = sc.nextLine();
		ArrayList<String> itemNames = new ArrayList<String>();
		ArrayList<Double> prices = new ArrayList<Double>();
		boolean success = false;
		try {
			Scanner fsc = new Scanner(new File(filename));
			String line;
			String[] parts;
			while (fsc.hasNextLine()) {
				line = fsc.nextLine().trim();
				if (line.length() == 0) {
					continue;   // skip the rest of the while loop; resume at top of the loop
				}
				parts = line.split("\t"); // parts[0] is the name; parts[1] is the price as a string
				itemNames.add(parts[0]);
				prices.add(Double.parseDouble(parts[1]));
			}
			fsc.close();
			success = true;
		} catch (Exception ex) {
			System.out.println("There was a problem reading the file.");
			success = false;
		}
		if (success == false) {
			System.out.println("Cannot continue.");
			// System.exit(1);  
			return;   // gets out of the program
		}
		printGroceries(itemNames,prices);
		itemNames.add(1,"Frozen Pizza");
		prices.add(1,7.99);
		System.out.println();
		printGroceries(itemNames,prices);
	}
}
