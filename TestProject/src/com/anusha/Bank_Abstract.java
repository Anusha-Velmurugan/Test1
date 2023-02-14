package com.anusha;

public  class Bank_Abstract extends Customer_Abstrct {

	@Override
	public void personalLoan() {
     System.out.println("Personal Loan");
     System.out.println("EMI: 5000");
	}
    public static void main(String[] args) {
    	Bank_Abstract a = new Bank_Abstract();
    	a.personalLoan();
    	a.homeLoan();
		
	}
}

