package org.amdocs;

public class SavingsAccount {
	public double getBalance() {
		
		System.out.println("assume balance is retrived from database");
		return 5000.00;
	}
	
	public double withdraw (double amountToBeWithdraw) {
		
		double currentBalance=getBalance();
		if(amountToBeWithdraw<currentBalance)
			  currentBalance=currentBalance-amountToBeWithdraw;
		
		updateBalanceIntoDB(currentBalance);
		return amountToBeWithdraw;
		
		
	}

	public void updateBalanceIntoDB(double currentBalance) {
		// TODO Auto-generated method stub
		System.out.println("");
		
	}

}
