/*
 * This program illustrate using ArrayLists
 * It manages a list of ten numbers
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;

public class ArrayListFun {
	public static void printNumbers(ArrayList<Integer> numbers) {
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
	}
	public static void printNumbersAlt(ArrayList<Integer> numbers) {
		for (int num : numbers) {
			System.out.println(num);
		}
	}
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			numbers.add(rnd.nextInt(100));
		}
		printNumbers(numbers);
		System.out.println();
		printNumbersAlt(numbers);
		System.out.println("Will now retrieve a value at random.");
		int index = rnd.nextInt(numbers.size());  // chooses which room to randomly pick
		System.out.println(numbers.get(index));
		System.out.print("Enter the position and value you want to insert: ");
		int pos, val;
		pos = sc.nextInt();
		val = sc.nextInt();
		numbers.add(pos,val);
		printNumbers(numbers);
		System.out.print("Enter the position of what you want to remove: ");
		pos = sc.nextInt();
		numbers.remove(pos);
		printNumbers(numbers);
		System.out.print("Enter an actual value you want to remove: ");
		val = sc.nextInt();
		numbers.remove(new Integer(val));
		printNumbers(numbers);
		Collections.sort(numbers);
		printNumbers(numbers);
	}
}
