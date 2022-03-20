package spinoza;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    // ActionListener for ConvertButton
	public static ActionListener ConvertButtonListener = new ActionListener() {
		// process temperature conversion
		public void actionPerformed(ActionEvent e) {
			// Get user input
			String InputString1 = ConverterView.UserInput1.getText();

			// Convert (string) input Temperature to Double
			Double InputDouble = Double.parseDouble(InputString1);

            // declare temperature variables
			Double Fahrenheit;
			Double Celsius;
			Double Kelvin;

			// Get JComboBox Selection
			String SelectedScale = (String) ConverterView.myComboBox.getSelectedItem();

			if ("Fahrenheit".equals(SelectedScale)) {
                 // user input
				Fahrenheit = InputDouble;

				// make conversions
				Celsius = Temperature.FahrenheitToCelsius(Fahrenheit);
				Kelvin = Temperature.FahrenheitToKelvin(Fahrenheit);

                // Convert double (Results) to Strings
				String StringFahrenheit = Double.toString(Fahrenheit);
				String StringCelsius = Double.toString(Celsius);
				String StringKelvin = Double.toString(Kelvin);

                // Send values to JTextFields
				ConverterView.ResultsFahrenheit.setText(StringFahrenheit);
				ConverterView.ResultsCelsius.setText(StringCelsius);
				ConverterView.ResultsKelvin.setText(StringKelvin);
			}

			else if ("Celsius".equals(SelectedScale)) {
                 // user input
				Celsius = InputDouble;

				// make conversions
				Fahrenheit = Temperature.CelsiusToFahrenheit(Celsius);
				Kelvin = Temperature.CelsiusToKelvin(Celsius);
				
                // Convert double (Results) to Strings
				String StringFahrenheit = Double.toString(Fahrenheit);
				String StringCelsius = Double.toString(Celsius);
				String StringKelvin = Double.toString(Kelvin);

                // Send values to JTextFields
				ConverterView.ResultsFahrenheit.setText(StringFahrenheit);
				ConverterView.ResultsCelsius.setText(StringCelsius);
				ConverterView.ResultsKelvin.setText(StringKelvin);
			}

			else if ("Kelvin".equals(SelectedScale)) {
                // user input
				Kelvin = InputDouble;

				// make conversions
				Fahrenheit = Temperature.KelvinToFahrenheit(Kelvin);
				Celsius = Temperature.KelvinToCelsius(Kelvin);

                // Send values to JTextFields
				ConverterView.ResultsFahrenheit.setText(String.valueOf(Temperature.KelvinToFahrenheit(Kelvin)));
				ConverterView.ResultsCelsius.setText(String.valueOf(Temperature.KelvinToCelsius(Kelvin)));
				ConverterView.ResultsKelvin.setText(String.valueOf(Kelvin));
			}
		}
	};

	// ActionListener for JButton "ButtonClear"
	public static ActionListener ButtonClearListener = new ActionListener() {
		// clear fields
		public void actionPerformed(ActionEvent e) {
			ConverterView.UserInput1.setText("");
			ConverterView.ResultsFahrenheit.setText("");
			ConverterView.ResultsCelsius.setText("");
			ConverterView.ResultsKelvin.setText("");
		}
	};

	// ActionListener for JButton "ButtonCalculate"
	public static ActionListener ButtonCalculateListener = new ActionListener() {
		// make calculations and output the results
		public void actionPerformed(ActionEvent e) {
			// Get user input seconds
			String InputString = ConverterView.InputSeconds.getText();

			// Convert (string) input seconds to Integer
			int InputInteger = Integer.parseInt(InputString);
			int seconds = InputInteger;
			int TotalSec = seconds;

			// Calculate the number of minutes, hours, and days
			int days = Seconds.SecondsToDays(seconds);
			int hours = Seconds.SecondsToHours(seconds);
			int minutes = Seconds.SecondsToMinutes(seconds);
			int RemainSeconds = Seconds.RemainingSeconds(seconds);

			// Convert Integers (Results) to Strings
			String StringDays = Integer.toString(days);
			String StringHours = Integer.toString(hours);
			String StringMinutes = Integer.toString(minutes);
			String StringSeconds = Integer.toString(RemainSeconds);
			String StringTotalSeconds = Integer.toString(TotalSec);

			// Send values to JTextFields
			ConverterView.InfoLabel.setText("There are...");
			ConverterView.ResultsDays.setText(StringDays);
			ConverterView.ResultsHours.setText(StringHours);
			ConverterView.ResultsMinutes.setText(StringMinutes);
			ConverterView.ResultsSeconds.setText(StringSeconds);
			ConverterView.TotalSeconds.setText("In " + StringTotalSeconds + " Seconds");
		}
	};

}
