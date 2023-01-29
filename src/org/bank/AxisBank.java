package org.bank;

public class AxisBank extends BankInfo {
	public void deposit() {
	long c;
	c=a+b;
    System.out.println("TotalDeposit:"+c);
		
	}


	public static void main(String[] args) {
		AxisBank axs=new AxisBank();
		axs.saving();
		axs.fixed();
		axs.deposit();
		
		// TODO Auto-generated method stub

	}

}
