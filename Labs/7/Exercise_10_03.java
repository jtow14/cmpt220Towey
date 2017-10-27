
public class Exercise_10_03
{
	public static void main(String[] args)
	{
		int[] values = {1, 2, 3, 4, 5}; 

		System.out.println("Test if values are even using isEven(int) :: ");
		for (int i = 0; i < values.length; i++)
		{
			System.out.println(values[i] + " " + MyInteger10_03.isEven(values[i]));
		}

		System.out.println("Test if values are odd using isOdd(int) :: ");
		for (int i = 0; i < values.length; i++)
		{
			System.out.println(values[i] + " " + MyInteger10_03.isOdd(values[i]));
		}

		System.out.println("Test if values are prime using isPrime(int) :: ");
		for (int i = 0; i < values.length; i++)
		{
			System.out.println(values[i] + " " + MyInteger10_03.isPrime(values[i]));
		}

		System.out.println("Test if values are even using isEven() :: ");
		for (int i = 0; i < values.length; i++)
		{
			MyInteger10_03 value = new MyInteger10_03(values[i]);
			System.out.println(value.getValue() + " " + value.isEven());
		}

		System.out.println("Test if values are odd using isOdd() :: ");
		for (int i = 0; i < values.length; i++) 
		{
			MyInteger10_03 value = new MyInteger10_03(values[i]);
			System.out.println(value.getValue() + " " + value.isOdd());
		}

		System.out.println("Test if values are prime using isPrime() :: ");
		for (int i = 0; i < values.length; i++)
		{
			MyInteger10_03 value = new MyInteger10_03(values[i]);
			System.out.println(value.getValue() + " " + value.isPrime());
		}

		System.out.println("Test if values are even using isEven(MyInteger) :: ");
		for (int i = 0; i < values.length; i++)
		{
			MyInteger10_03 value = new MyInteger10_03(values[i]);
			System.out.println(value.getValue() + " " + MyInteger10_03.isEven(value));
		}

		System.out.println("Test if values are odd using isOdd(MyInteger) ::");
		for (int i = 0; i < values.length; i++)
		{
			MyInteger10_03 value = new MyInteger10_03(values[i]);
			System.out.println(value.getValue() + " " + MyInteger10_03.isOdd(value));
		}

		System.out.println("Test if values are prime using isPrime(MyInteger) :: ");
		for (int i = 0; i < values.length; i++)
		{
			MyInteger10_03 value = new MyInteger10_03(values[i]);
			System.out.println(value.getValue() + " " + MyInteger10_03.isPrime(value));
		}

		int[] values2 = {5, 9, 7};
		MyInteger10_03 value = new MyInteger10_03(9);
		System.out.println("Test if " + value.getValue() + " is equal to the specified value :: ");
		for (int i = 0; i < values2.length; i++)
		{
			System.out.println(values2[i] + " " + value.equals(values2[i]));
		}

		System.out.println("\nTest if " + value.getValue() + " is equal to the specified value :: ");
		for (int i = 0; i < values2.length; i++)
		{
			MyInteger10_03 myInteger = new MyInteger10_03(values2[i]);	
			System.out.println(values2[i] + " " + value.equals(myInteger));
		}

		System.out.println("\nTest parseInt(char[]) and parseInt(String) :: ");
		char[] numericCharacters = {'3', '4', '2'};

		String numericString = "658";
		System.out.print("\'");
		for (int i = 0; i < numericCharacters.length; i++)
		{
		 	System.out.print(numericCharacters[i] + "");
		} 
		System.out.println("\' + \"" + numericString + "\" = " + (MyInteger10_03.parseInt(numericCharacters) + MyInteger10_03.parseInt(numericString)));
	}
}