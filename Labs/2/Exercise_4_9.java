import java.util.Scanner;

public class Exercise_4_9
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a character :: ");
		String st = input.nextLine();
		char ch = st.charAt(0);

		System.out.println((int)ch);
	}
}