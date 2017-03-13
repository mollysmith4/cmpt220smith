import java.util.Calendar;
import java.util.GregorianCalendar;
public class nine_five {

	public static void main(String[] args) {
		//Construct a Gregorian calendar for the current date and time
		Calendar calendar = new GregorianCalendar();
		System.out.println("YEAR: " + calendar.get(GregorianCalendar.YEAR));
		System.out.println("MONTH: " + calendar.get(GregorianCalendar.MONTH));
		System.out.println("DAY_OF_MONTH: " + calendar.get(GregorianCalendar.DAY_OF_MONTH));
		
		//Set a specified elapsed time
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(1234567898765L);
		System.out.println(cal.getTime());

	}

}
