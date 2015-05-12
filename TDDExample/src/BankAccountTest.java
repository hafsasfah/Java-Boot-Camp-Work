import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

	@Test
	public void testBankAccount() {
		BankAccount account = new BankAccount();
		assertNotNull( account );
	}

	@Test
	public void testBankAccountDouble() {
		BankAccount account = new BankAccount(10.0);
		assertNotNull( account );
	}

	@Test
	public void testGetBalance() {
		BankAccount account = new BankAccount();
		assertEquals(0.0, account.getBalance(), 0.0 );
	}

	@Test
	public void testWithdraw() {
		BankAccount account = new BankAccount();
		account.withdraw( 10.0 );
		assertEquals( -10.0, account.getBalance(), 0.0 );
	}

	@Test
	public void testDeposit() {
		BankAccount account = new BankAccount();
		account.deposit( 10.0 );
		assertEquals( 10.0, account.getBalance(), 0.0 );
	}

}
