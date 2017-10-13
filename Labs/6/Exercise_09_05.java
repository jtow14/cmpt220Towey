import java.util.GregorianCalendar;

public class Exercise_09_05
{
	public static void main(String[] args)
	{
		GregorianCalendar calender = new GregorianCalendar();

		System.out.println("Current year, month, and day in format Month/Day/Year :: ");
		System.out.println(calender.get(calender.MONTH) + "/" + calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));

		calender.setTimeInMillis(1234567898765L);

		System.out.println("Elapsed time since January 1, 1970 in format Month/Day/Year :: ");
		System.out.println(calender.get(calender.MONTH) + "/" + calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));
	}
}