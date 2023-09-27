/*
 * This illustrates menu-driven programs and exceptions
 */

import java.util.Scanner;

/**
 * This program asks the user to enter two numbers.
 * It then presents the user with options for what kind of arithmetic to do with them.
 */
public class FunWithNumbers {
	public static void printWelcome() {
		System.out.println("*".repeat(60));
		System.out.println(" ".repeat(22) + "Fun with Numbers");
		System.out.println("*".repeat(60));
		System.out.println();
	}
	public static void printMenu() {
		System.out.println("Here are your options: ");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Quit");
		System.out.print("Enter the number of your choice: ");
	}
	public static void main(String[] args) {
		printWelcome();
		Scanner sc = new Scanner(System.in);
		double num1=0, num2=0;
		boolean proceed;
		do {
			proceed = true;
			System.out.print("Enter the numbers you want to work with: ");
			try {
				num1 = sc.nextDouble();
				num2 = sc.nextDouble();
			} catch (Exception ex) {
				System.out.println("You had to enter numbers.");
				sc.nextLine();   // clears out the input channel so they can enter fresh
				proceed = false;
			}
		} while (proceed == false);
		int choice;
		double sum, diff, prod, quot; 
		do {
			printMenu();
			choice = sc.nextInt();
			if (choice == 1) {
				sum = num1 + num2;
				System.out.printf("The sum of %.2f and %.2f is %.2f.\n", num1, num2, sum);
			} else if (choice == 2) {
				diff = num1 - num2;
				System.out.printf("The difference of %.2f and %.2f is %.2f.\n", num1, num2, diff);
			} else if (choice == 3) {
				prod = num1 * num2;
				System.out.printf("The product of %.2f and %.2f is %.2f.\n", num1, num2, prod);
			} else if (choice == 4) {
				if (num2 == 0) {
					System.out.println("You can't divide by 0.");
				} else {
					quot = num1 / num2;
					System.out.printf("The quotient of %.2f and %.2f is %.2f.\n", num1, num2, quot);
				}
			} else if (choice != 5) {
				System.out.println("Dude, what you doin?");
			}
		} while (choice != 5);
	}
}
