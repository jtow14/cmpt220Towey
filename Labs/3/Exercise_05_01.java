import java.util.Scanner;

// JA: You need a loop to re3ad all the values and calculate the average
public class Exercise_05_01
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int pos = 0;
		int neg = 0;
		int count = 0;
		int total = 0;
		
		System.out.print("Enter an integer, the input ends if it is 0 :: ");
		int num = input.nextInt();
		
		if (num == 0)
		{
			System.out.println("No numbers are entered except 0.");
		}
		else if (num > 0)
		{
			pos++;
			total += num;
			count++;
		}
		else
		{
			neg++;
			total += num;
			count++;
		}
		num = input.nextInt();
		
		double average = total / count;
		
		System.out.println("The number of positive is " + pos + "\nThe number of negatives is " + neg + "\nThe total is " + total + "\nThe average is " + average);
	}
}