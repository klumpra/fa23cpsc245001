
import java.util.Scanner;
import java.io.File;

public class ReadFileExample {
	/**
	 * this function reads the file named fname from beginning to end.
	 * It returns a string containing all the lines separated by a space.
	 * @param fname name of the file to open and read
	 * @return a String with all the lines connected by spaces
	 */
	public static String readFile(String fname) {
		try {
			String result = "";
			Scanner fsc = new Scanner(new File(fname));
			String line;
			while (fsc.hasNextLine()) {
				line = fsc.nextLine();
				result = result + line + " ";
			}
			result = result.trim();
			fsc.close();
			return result;
		} catch (Exception ex) {
			return null;    // indicates failure - couldn't return a String
		}
	}
	public static void main(String[] args) {
		System.out.print("Enter the name of the file: ");
		Scanner sc = new Scanner(System.in);
		String fname;
		fname = sc.nextLine();
		/* this will read the contents of the chosen file into a single string.
		 * What used to be separate lines will now be separated by spaces.
		 * This is exactly what you have to do in the first step of homework 5.
		 */
		/*
		try {
			Scanner fsc = new Scanner(new File(fname));
			String line;
			String allTogether = "";
			while (fsc.hasNextLine()) {
				line = fsc.nextLine();
				allTogether = allTogether + line + " ";
			}
			allTogether = allTogether.trim();
			System.out.println(allTogether);
			fsc.close();
		} catch (Exception ex) {
			System.out.println("Could not read the file.");
		}
		*/
		String allTogether = readFile(fname);
		if (allTogether == null) {
			System.out.println("couldn't read the file.");
		} else {
			System.out.println(allTogether);
		}
	}
}
