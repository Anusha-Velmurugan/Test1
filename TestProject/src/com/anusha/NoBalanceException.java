package com.anusha;

public class NoBalanceException extends Exception {

	public NoBalanceException(int i) {
		System.out.println("Cash Not Available");
	}

	public NoBalanceException() {
		System.out.println("Insufficient Balance");
	}

}
