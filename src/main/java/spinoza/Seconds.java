package spinoza;

// Seconds class: converts seconds to days, hours, and minutes
public class Seconds {
	// constants
	final static int SECONDS_PER_MINUTE = 60; // Seconds in a minute
	final static int MINUTES_PER_HOUR = 60; // minutes in an hour
	final static int HOURS_PER_DAY = 24; // hours in a day

	// Temperature Converter Methods
	public static int SecondsToMinutes(int seconds) {
		int minutes = seconds / SECONDS_PER_MINUTE;
		seconds -= minutes * SECONDS_PER_MINUTE;

		int hours = minutes / MINUTES_PER_HOUR;
		minutes -= hours * MINUTES_PER_HOUR;

		int days = hours / HOURS_PER_DAY;
		hours -= days * HOURS_PER_DAY;

		return minutes;
	}

	public static int SecondsToHours(int seconds) {
		int minutes = seconds / SECONDS_PER_MINUTE;
		seconds -= minutes * SECONDS_PER_MINUTE;

		int hours = minutes / MINUTES_PER_HOUR;
		minutes -= hours * MINUTES_PER_HOUR;

		int days = hours / HOURS_PER_DAY;
		hours -= days * HOURS_PER_DAY;

		return hours;
	}

	public static int SecondsToDays(int seconds) {
		int minutes = seconds / SECONDS_PER_MINUTE;
		seconds -= minutes * SECONDS_PER_MINUTE;

		int hours = minutes / MINUTES_PER_HOUR;
		minutes -= hours * MINUTES_PER_HOUR;

		int days = hours / HOURS_PER_DAY;
		hours -= days * HOURS_PER_DAY;

		return days;
	}

	public static int RemainingSeconds(int seconds) {
		int minutes = seconds / SECONDS_PER_MINUTE;
		seconds -= minutes * SECONDS_PER_MINUTE;

		int hours = minutes / MINUTES_PER_HOUR;
		minutes -= hours * MINUTES_PER_HOUR;

		int days = hours / HOURS_PER_DAY;
		hours -= days * HOURS_PER_DAY;

		return seconds;
	}

}