package com.anusha;

public class Exception_Userdefnd {
	public static void main(String[] args) throws NoBalanceException {
		int amnt=20000;
		int accBal=19000;
		if (amnt>accBal) {
			throw new NoBalanceException();
		} else {
            throw new NoBalanceException(4);
		}
	}

}
