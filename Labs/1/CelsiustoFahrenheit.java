import java.util.Scanner;

public class CelsiustoFahrenheit
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a temperature in Celsius :: ");
		double celsius = input.nextDouble();
		
		double fahrenheit = (9.0 / 5.0) * celsius + 32;
		System.out.println("Celsius " + celsius + " is " + fahrenheit + " in Celsius.");
	}

}
