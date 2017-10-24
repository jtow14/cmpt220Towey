
public class Exercise_09_07
{
	public static void main(String[] args)
	{
		// JA: Where is this class defined?
		Account account = new Account(1122, 20000);

		account.setAnnualInterestRate(4.5);

		account.withdraw(2500);

		account.deposit(3000);

		System.out.println("Account Statement -->");
		System.out.println("Account ID :: " + account.getId());
		System.out.println("Date created :: " + account.getDateCreated());
		System.out.printf("Balance :: " + account.getBalance());
		System.out.printf("Monthly interest :: " + account.getMonthlyInterest());
	}
}