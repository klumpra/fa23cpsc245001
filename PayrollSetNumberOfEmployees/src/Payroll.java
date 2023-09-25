/*
 * Illustrates using a for loop - a counter-controlled loop
 */

import java.util.Scanner;

/**
 * This application asks the user how many employees they have.
 * It then allows them to calculate gross pay for each.
 */
public class Payroll {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many employees do you have? ");
		int empCount = sc.nextInt();
		double rate, hours, gross;
		for (int i = 0; i < empCount; i++) {
			System.out.print("Enter hours worked: ");
			hours = sc.nextDouble();
			System.out.print("Enter hourly pay rate: ");
			rate = sc.nextDouble();
			gross = hours * rate;
			System.out.printf("You earned a gross pay of $%.2f.\n", gross);
		}
	}
}
