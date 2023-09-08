/*
 * Ray Klump
 * 9/8/2023
 * Calculates amount of flooring and cost for covering a specified floor
 * 
 */

public class Flooring {
	public static void main(String[] args) {
		// the givens
		double roomWidth = 25.5;
		double roomLength = 29.25;
		int planksPerPack = 6;
		double plankWidth = 8/12.0;
		double plankLength = 28/12.0;
		double packageCost = 39.99;
		double taxRate = 0.0875;
		
		// calculate quantities
		double roomArea = roomWidth * roomLength;
		double coveragePerPack = planksPerPack * plankWidth * plankLength;
		double packagesNeeded = Math.ceil(roomArea / coveragePerPack);  // rounding up
		double costOfPacks = packageCost * packagesNeeded;
		double taxes = taxRate * costOfPacks;
		double totalCost = costOfPacks + taxes;
		
		// print the results
		System.out.println("****************************************");
		System.out.printf("%-25s%10.2f\n", "Area of room", roomArea);
		System.out.printf("%-25s%10.2f\n", "Number of packs", packagesNeeded);
		System.out.printf("%-25s%10.2f\n", "Cost of packs", costOfPacks);
		System.out.printf("%-25s%10.2f\n", "Taxes", taxes);
		System.out.printf("%-25s%10.2f\n", "Total cost", totalCost);
		System.out.println("****************************************");
		
	}
}
