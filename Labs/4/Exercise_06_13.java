
public class Exercise_06_13
{
	public static void main(String[] args)
	{
		double start  =  1.0;
		double numOfRows = 20.0;

		System.out.println("\ni         m(i)     ");
		System.out.println("-------------------");

		for (double i = start; i <= numOfRows; i++)
		{
			System.out.printf("%-10.0f", i);
			System.out.printf("%7.4f\n", sum(i));
		}
	}

	public static double sum(double n)
	{
		double sum = 0;
		for (double i = 1; i <= n; i++)
		{
			sum += i / (i + 1);
		}
		return sum;
	}
}