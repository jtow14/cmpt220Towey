import java.util.Scanner;

public class Exercise_10_05
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a positive integer :: ");
		int number = input.nextInt();

		System.out.print("The smallest factors of " + number + " are :: ");
		StackOfIntegers10_05 stack = new StackOfIntegers10_05();

		smallestFactors(number, stack);

		while (!stack.empty())
		{
			System.out.print(stack.pop() + "\n");
		}
	}

	public static void smallestFactors(int number, StackOfIntegers10_05 stack)
	{
		int i = 2;
		while (number / i != 1)
		{ 
			if (number % i == 0)
			{
				stack.push(i);
				number /= i;
			}
			else
			{
				i++;
			}
		}
		stack.push(number);
	}
}