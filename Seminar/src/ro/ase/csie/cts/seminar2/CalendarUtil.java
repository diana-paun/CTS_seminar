package ro.ase.csie.cts.seminar2;

public class CalendarUtil {

	public String weekDay(int day) {
		if (day == 1)
			return "sunday";
		else if (day == 2)
			return "Monday";
		else if (day == 3)
			return "Tuesday";
		else if (day == 4)
			return "Wednesday";
		else if (day == 5)
			return "Thursday";
		else if (day == 6)
			return "Friday";
		else if (day == 7)
			return "Saturday";

		return null;
	}

	// inlocuim if-else cu switch
	public String weekDay2(int day) {
		switch (day) {
		case 1:
			return "sunday";
		case 2:
			return "Monday";
		case 3:
			return "Tuesday";
		case 4:
			return "Wednesday";
		case 5:
			return "Thursday";
		case 6:
			return "Friday";
		case 7:
			return "Saturday";
		default:
			return null;
		}
	}

	// vector
	public String weekDay3(int day) {
		String[] weekDays= {"Sunday", "Monday","Tuesday","Wednesday","Friday","Saturday"};
		return weekDays[day-1];
	}
}
