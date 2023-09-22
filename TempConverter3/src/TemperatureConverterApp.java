
/*
 * Ray Klump
 * This application demonstrates calling static functions
 */

import java.util.Scanner;


class TemperatureConverter {
	/**
	 * This function converts from celsius to fahrenheit
	 * @param celsius The temperature in celsius
	 * @return the temperature in Fahrenheit
	 */
	public double convertToFahrenheit(double celsius) {
		double fahr =  9.0/5* celsius + 32;
		return fahr;
	}
	/**
	 * This function converts from fahrenheit to celsius
	 * @param fahr The temperature in Fahrenheit
	 * @return the temperature in celsius
	 */
	public double convertToCelsius(double fahr) {
		double celsius = (fahr-32)*5/9.0;
		return celsius;
	}
}

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