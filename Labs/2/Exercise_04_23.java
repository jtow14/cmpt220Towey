import java.util.Scanner;

public class Exercise_04_23
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter employee’s name :: ");
		String name = input.next();	
		System.out.print("Enter number of hours worked in a week :: ");
		double hoursWorked = input.nextDouble();
		System.out.print("Enter hourly pay rate :: ");
		double hourlyPayRate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate :: ");
		double federalTaxRate = input.nextDouble();
		System.out.print("Enter state tax withholding rate :: ");
		double stateTaxRate = input.nextDouble();

		double grossPay, federal, state, totalDeduction;
		System.out.println("Employee Name: " + name + "\nHours Worked: " + hoursWorked + "\nPay Rate: $" + hourlyPayRate +
			"\nGross Pay: $" + (grossPay = hoursWorked * hourlyPayRate) + "\nDeductions:\n Federal Witholding: $" +
			(federal = grossPay * federalTaxRate) + "\n State Witholding: $" + (state = grossPay * stateTaxRate) +
			"\n Total Deduction: $" + (totalDeduction = federal + state) + "\nNet Pay: $" + (grossPay - totalDeduction));
	}

}