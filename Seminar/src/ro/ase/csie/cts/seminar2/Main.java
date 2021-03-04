package ro.ase.csie.cts.seminar2;

public class Main {

	public static void main(String[] args) {
		
		CalendarUtil cu = new CalendarUtil();
		try {
			System.out.println(cu.weekDay(3).toUpperCase());
			
			System.out.println(cu.weekDay2(3));//cu switch
			
			System.out.println(cu.weekDay3(3));//cu vector
			
			System.out.println(cu.weekDay4(3)); //new DateFormat
		
		} catch (IcorectDayException e) {
			System.out.println(e.getMessage());
		}

	}
}
