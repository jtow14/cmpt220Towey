
public class Exercise_05_13
{
	public static void main(String[] args)
	{
		int n = 0;

		while (Math.pow(n + 1, 3) < 12000)
		{
			n++;
		}
		System.out.println("Largest integer such that n^3 is less than 12,000 :: " + n);
	}
}