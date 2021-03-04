package ro.ase.csie.cts.seminar2;

import java.text.DateFormatSymbols;
import java.util.Locale;

public class CalendarUtil {

	public String weekDay(int day) throws IcorectDayException {
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

		throw new IcorectDayException("Only 7 days in a week");
	}

	// inlocuim if-else cu switch
	public String weekDay2(int day)  throws IcorectDayException {
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
			throw new IcorectDayException("Only 7 days in a week");
		}
	}

	// vector
	public String weekDay3(int day) throws IcorectDayException {
		if(day < 1 || day > 7)
			throw new IcorectDayException("Only 7 days in a week");
		String[] weekDays= {"Sunday", "Monday","Tuesday","Wednesday","Friday","Saturday"};
		return weekDays[day-1];
	}
	
	//new DateFormat
	public String weekDay4(int day) throws IcorectDayException {
		if(day < 1 || day > 7)
			throw new IcorectDayException("Only 7 days in a week");
		String [] days = new DateFormatSymbols().getInstance(Locale.ITALIAN).getWeekdays();
		return days[day-1];
	}
}
