package com.anusha;

public class Exception_Tc {
	public static void main(String[] args) {
		try {
			System.out.println(10/0);
			
		} catch (Exception e) {
			System.out.println("System Error");
		}
		System.out.println("hello");
	}

}
