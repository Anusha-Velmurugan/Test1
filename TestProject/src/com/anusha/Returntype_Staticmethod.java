package com.anusha;

public class Returntype_Staticmethod {
	public static void add() {
		System.out.println(10+20);

	}
	public String name() {
		int a=10;
		int b=20;
		String n="Anusha";
		System.out.println(a + " " +b);
		return n;
	}
	public static void main(String[] args) {
		add();
		Returntype_Staticmethod a=new Returntype_Staticmethod();
		String b = a.name();
		System.out.println(b);
	}

}
