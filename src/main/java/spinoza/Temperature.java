package spinoza;

// Temperature class: converts temperature to Fahrenheit, Celsius, or Kelvin
public class Temperature {

	// Temperature Converter Methods
	public static double FahrenheitToCelsius(double Fahrenheit) {
		Double Celsius = 5.0 / 9 * (Fahrenheit - 32);
		return Celsius;
	}

	public static double FahrenheitToKelvin(double Fahrenheit) {
		double Kelvin = (Fahrenheit + 459.67) * 5 / 9;
		return Kelvin;
	}

	public static double CelsiusToFahrenheit(double Celsius) {
		double Fahrenheit = 9.0 / 5 * Celsius + 32;
		return Fahrenheit;
	}

	public static double CelsiusToKelvin(double Celsius) {
		double Kelvin = Celsius + 273.15;
		return Kelvin;
	}

	public static double KelvinToFahrenheit(double Kelvin) {
		double Fahrenheit = Kelvin * 9 / 5 - 459.67;
		return Fahrenheit;
	}

	public static double KelvinToCelsius(double Kelvin) {
		double Celsius = Kelvin - 273;
		return Celsius;
	}

}