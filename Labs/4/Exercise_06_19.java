
public class Exercise_06_09
{
	public static void main(String[] args)
	{
		System.out.println("\nFeet     Meters     |     Meters     Feet\n" + "----------------------------------------------");
		for (double feet = 1.0, meters = 20.0; feet <= 10.0; feet++, meters += 5)
		{
			System.out.printf("%6.3f", feetToMeters(feet));
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three sides for a triangle :: ");
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		System.out.println(isValid(side1, side2, side3) ? "The area of the triangle is " + area(side1, side2, side3) : "Input is invalid");
	}

	public static boolean isValid(double side1, double side2, double side3)
	{
		boolean valid = side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
		return valid;
	}

	public static double metersToFeet(double meters)
	{
		return 3.279 * meters;
	}
}