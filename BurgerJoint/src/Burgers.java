import java.util.Scanner;
public class Burgers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** Welcome to BurgerZone ***");
		System.out.print("How many burger meals would you like to buy? ");
		int count = sc.nextInt();
		double burgerPrice = 2.99;
		double total = burgerPrice;
		System.out.print("Do you want to add bacon? ");
		String addBacon = sc.next().trim().toLowerCase();  // trims the extra spaces
		System.out.print("Do you want to add cheese? ");
		String addCheese = sc.next().trim().toLowerCase();
		System.out.print("Do you want to add pickles? ");
		String addPickles = sc.next().trim().toLowerCase();
		System.out.print("Do you want fries? ");
		String addFries = sc.next().trim().toLowerCase();
		System.out.print("Do you want a drink? ");
		String addDrink = sc.next().trim().toLowerCase();
		String superSize;
		if (addDrink.equals("y") || addFries.equals("y")) {
			System.out.print("Do you want to supersize? ");
			superSize = sc.next().trim().toLowerCase();
		} else {
			superSize = "n";
		}
		if (addBacon.equalsIgnoreCase("y")) {
			total = total + 0.5;
		}
		if (addCheese.equals("y")) {
			total = total + 1.00;
		}
		if (addPickles.equals("y")) {
			total = total + 0.25;
		}
		// supersize option applies to fries + drink. So keep track separately
		double friesAndDrink = 0;
		if (addFries.equals("y")) {
			friesAndDrink = friesAndDrink + 1.00;
		}
		if (addDrink.equals("y")) {
			friesAndDrink = friesAndDrink + 1.50;
		}
		if (superSize.equals("y")) {
			friesAndDrink = 1.5 * friesAndDrink;
		}
		total = total + friesAndDrink;
		double costOfAllMeals = count * total;
		System.out.printf("The total cost of %d burger meals is $%.2f.\n", count, costOfAllMeals);
	}
}
