import java.util.Scanner;

public class Exercise_12_05
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		boolean repeatSidesInput = true;
		do
		{
			System.out.print("Enter three side of the triangle: ");
			double side1 = input.nextDouble();		
			double side2 = input.nextDouble();		
			double side3 = input.nextDouble();
	
				Triangle triangle = new Triangle(side1, side2, side3);
				repeatSidesInput = false;	
				
				System.out.println(triangle.toString());
				System.out.println("Area: " + triangle.getArea());
				System.out.println("Perimeter: " + triangle.getPerimeter());
		}
		while (repeatSidesInput);
	}
}