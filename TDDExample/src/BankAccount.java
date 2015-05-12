
public class BankAccount {
	private double balance;
	
	public BankAccount()
	{
		balance = 0;
	}
	
	public BankAccount( double balance )
	{
		this.balance = balance;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void withdraw( double money )
	{
		balance -= money;
	}
	
	public void deposit( double money )
	{
		balance += money;
	}
}
