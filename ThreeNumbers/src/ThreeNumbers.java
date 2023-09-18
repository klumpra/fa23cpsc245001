/*
 * This demonstrates creating functions other than main.
 * It will add and multiply three numbers together.
 */
import java.util.Scanner;

/**
 * This class computes the sum and product of three integers.
 */
public class ThreeNumbers {
	/**
	 * Computes the sum of three ints and returns it
	 * @param a the first number
	 * @param b the second number
	 * @param c the third number
	 * @return the sum of a+b+c
	 */
	public static int computeSum(int a, int b, int c) {
		int result = a + b + c;
		return result;
	}
	/**
	 * Computes the product of three ints and returns it.
	 * @param a the first number
	 * @param b the second number
	 * @param c the third number
	 * @return the product a*b*c
	 */
	public static int computeProd(int a, int b, int c) {
		int result = a * b * c;
		return result;
	}
	public static void printWelcome() {
		System.out.println("*".repeat(60));
		System.out.println(" ".repeat(21) + "Welcome to AddProd");
		System.out.println("*".repeat(60));
		System.out.println();
	}
	public static void main(String[] args) {
		printWelcome();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three integers: ");
		int num1, num2, num3;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		int sum, prod;
		sum = computeSum(num1,num2,num3);
		prod = computeProd(num1,num2,num3);
		System.out.printf("The sum is %d, and the product is %d.\n", sum, prod);
	}
}
