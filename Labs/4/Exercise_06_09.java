
public class Exercise_06_09
{
	public static void main(String[] args)
	{
		System.out.println("\nFeet     Meters     |     Meters     Feet\n" + "----------------------------------------------");
		for (double feet = 1.0, meters = 20.0; feet <= 10.0; feet++, meters += 5)
		{
			System.out.printf("%4.1f     ", feet);
			System.out.printf("%6.3f", feetToMeters(feet));
			System.out.print("     |     ");
			System.out.printf("%-11.1f", meters);
			System.out.printf("%7.3f\n", metersToFeet(meters));
		}
	}
	
	public static double feetToMeters(double feet)
	{
		return 0.305 * feet;
	}

	public static double metersToFeet(double meters)
	{
		return 3.279 * meters;
	}
}