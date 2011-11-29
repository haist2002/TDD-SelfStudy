package chapter2;

import static org.junit.Assert.fail;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {
	
	private Account account;
	
	@Before
	public void setup() {
		this.account = new Account(10000);
	}
	
	@Test
	public void testAccount() throws Exception {
		Account testAccount = null;
		assertNull("account is null!",testAccount);
	}
	
	@Test
	public void testGetBalance() throws Exception{
		assertEquals(10000,account.getBalance());
		
		account = new Account(1000);
		assertEquals(1000, account.getBalance());
		
		account = new Account(0);
		assertEquals(0, account.getBalance());
	}

	
	@Test
	public void testDeposit() throws Exception{
		Account account = new Account(10000);
		account.deposit(1000);
		assertEquals(11000, account.getBalance());
	}
	
	@Test
	public void testWithdraw(){
		Account account = new Account(10000);
		account.withdraw(1000);
		assertEquals(9000, account.getBalance());
	}
	
	

}
