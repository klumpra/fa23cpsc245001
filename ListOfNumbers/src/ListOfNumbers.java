/*
 * Demonstrates using arrays
 */

import java.util.Scanner;
import java.util.Random;

/**
 * This program generates 10 random integers and then
 * performs statistics on them.
 */
public class ListOfNumbers {
	public static void printWelcome() {
		System.out.println("************************");
		System.out.println("    Fun With Arrays");
		System.out.println("************************");
		System.out.println();
	}
	public static void printMenu() {
		System.out.println("Here are your choices: ");
		System.out.println("1. Calculate min");
		System.out.println("2. Calculate max");
		System.out.println("3. Calculate mean");
		System.out.println("4. Print the numbers");
		System.out.println("5. Quit");
		System.out.print("Enter the number of your choice: ");
	}
	/**
	 * This prints the list of numbers one per line
	 * @param nums the list of numbers
	 */
	public static void print(int[] nums) {
		for (int num : nums) {
			System.out.println(num);
		}
	}
	public static int calculateMin(int[] nums) {
		int min = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		return min;
	}
	public static int calculateMax(int[] nums) {
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		return max;		
	}
	public static double calculateMean(int[] nums) {
		double total = 0;
		for (int num : nums) {
			total = total + num;
	//		total += num;
		}
		double result = total / nums.length;
		return result;
	}
	public static int[] generateNumbers(int cap) {
		Random rnd = new Random();
		int[] result = new int[cap];
		for (int i = 0; i < cap; i++) {
			result[i] = rnd.nextInt(100);
		}
		return result;
	}
	public static void main(String[] args) {
		/*
		Random rnd = new Random();
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rnd.nextInt(100);
		}
		*/
		int[] numbers = generateNumbers(10);
		print(numbers);
		printWelcome();
		Scanner sc = new Scanner(System.in);
		int choice, theMin, theMax;
		double theMean;
		do {
			printMenu();
			choice = sc.nextInt();
			if (choice > 5) {
				System.out.println("That is not a valid choice.");
			} else if (choice == 1) {
				theMin = calculateMin(numbers);
				System.out.printf("The min is %d.\n", theMin);
			} else if (choice == 2) {
				theMax = calculateMax(numbers);
				System.out.printf("The max is %d.\n", theMax);
			} else if (choice == 3) {
				theMean = calculateMean(numbers);
				System.out.printf("The mean is %.2f.\n", theMean);
			} else if (choice == 4) {
				System.out.println("Here are the numbers:");
				print(numbers);
				System.out.println();
			}
		} while (choice != 5);
		System.out.println("Thank you for using this program.");
	}
}
