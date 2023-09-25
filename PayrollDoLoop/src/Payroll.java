/*
 * This program illustrates using do loops
 */

import java.util.Scanner;
public class Payroll {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double gross, hours, rate;
		String doAgain;
		do {
			System.out.print("Enter hours worked and pay rate: ");
			hours = sc.nextDouble();
			rate = sc.nextDouble();
			gross = hours * rate;
			System.out.printf("Your gross pay is %.2f.\n",gross);
			System.out.print("Do you have another employee? ");
			doAgain = sc.next().trim().toUpperCase();
		} while (doAgain.equals("Y"));
	}

}
