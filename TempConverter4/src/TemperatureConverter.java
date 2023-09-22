public class TemperatureConverter {
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