
/*
 * Ray Klump
 * This application demonstrates calling static functions
 */

import java.util.Scanner;


/**
 * This is an application that converts temperatures between celsius and fahrenheit
 */
public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temperature in degrees and the scale: ");
		double temp, otherTemp;
		String scale;
		temp = sc.nextDouble();
		scale = sc.next().toUpperCase();
		TemperatureConverter tc = new TemperatureConverter();
		if (scale.equals("C")) {
			otherTemp = tc.convertToFahrenheit(temp);
		} else if (scale.equals("F")) {
			otherTemp = tc.convertToCelsius(temp);
		} else {
			otherTemp = 0;
		}
		System.out.printf("The converted temperature is %.2f.\n", otherTemp);
	}
}