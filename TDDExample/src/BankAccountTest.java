import static org.junit.Assert.*;

import org.junit.Test;


public class BankAccountTest {

	@Test
	public void testBankAccount() {
		BankAccount account = new BankAccount();
		assertNotNull( account );
		assertEquals(0, account.getBalance(), 0);
	}

	@Test
	public void testBankAccountDouble() {
		BankAccount account = new BankAccount( 10 );
		assertNotNull( account );
		assertEquals(10, account.getBalance(), 0);
	}

	@Test
	public void testDeposit() {
		double deposit = 15;
		BankAccount account = new BankAccount();
		assertEquals(0, account.getBalance(), 0);
		account.deposit( deposit );
		assertEquals(deposit, account.getBalance(), 0);
	}

	@Test
	public void testWithdraw() {
		double withdrawl = 25;
		BankAccount account = new BankAccount(50);
		assertEquals(50, account.getBalance(), 0);
		account.withdraw( withdrawl );
		assertEquals(withdrawl, account.getBalance(), 0);
	}

}
