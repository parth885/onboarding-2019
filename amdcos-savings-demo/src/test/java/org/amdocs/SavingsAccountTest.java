package org.amdocs;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class SavingsAccountTest {

	@Test
	public void testWithdrawWhenCurrentBalanceIs5000Inr() {
		SavingsAccount account=new SavingsAccount();
		SavingsAccount accountSpy=spy(account);
		doReturn (5000.00).when (accountSpy).getBalance();
		doNothing().when(accountSpy).updateBalanceIntoDB(anyDouble());
		
		//code under test i.e. we are testing the withdraw method
		double updateBalance=accountSpy.withdraw(1000.00);
		double expectedBalance=4000.00;
		assertEquals (expectedBalance,updateBalance,0.0001);
		
		verify(accountSpy,times(1)).updateBalanceIntoDB(anyDouble());
	}

}
