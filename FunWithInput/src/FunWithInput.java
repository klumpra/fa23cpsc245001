/*
 * Practice input with Scanner
 */
import java.util.Scanner;
public class FunWithInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("Enter you full name: ");
		String fullName = sc.nextLine();
		System.out.print("How old are you? ");
		int age = sc.nextInt();
		int ageInMonths = age * 12;
		System.out.printf("It is good to meet you, %s. You are %d months old.\n", 
				fullName,ageInMonths);
		*/
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		System.out.print("Enter your full name: ");
		sc.nextLine();  // grabs the leftover eol marker
		String fullName = sc.nextLine();
		System.out.println(fullName + " " + age);
	}
}
