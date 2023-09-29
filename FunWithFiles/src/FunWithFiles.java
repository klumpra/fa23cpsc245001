/*
 * This program demonstrates working with files.
 */

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class FunWithFiles {
	public static void main(String[] args) {
		String fileName, outFileName;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the original file: ");
		fileName = sc.nextLine();
		System.out.print("Enter the name of the new file to create: ");
		outFileName = sc.nextLine();
		try {
			Scanner fsc = new Scanner(new File(fileName));
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(outFileName))));
			String line;
			while (fsc.hasNextLine()) {
				line = fsc.nextLine().toUpperCase();
				System.out.println(line);
				pw.println(line);
			}
			fsc.close();
			pw.close();
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Something bad happened accessing the file.");
		}
	}
}
