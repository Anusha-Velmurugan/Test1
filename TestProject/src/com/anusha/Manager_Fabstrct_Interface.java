package com.anusha;

public class Manager_Fabstrct_Interface implements Client_Interface{

	@Override
	public void personalLoan() {
		System.out.println("Personal Loan");
		System.out.println("Emi:7000");
		
	}

	@Override
	public void homeLoan() {
		System.out.println("Home Loan");
		System.out.println("Emi:5000");
		
	}
	public static void main(String[] args) {
		Manager_Fabstrct_Interface a=new Manager_Fabstrct_Interface();
		a.personalLoan();
		a.homeLoan();
	}

}
