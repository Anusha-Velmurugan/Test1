package com.anusha;

public class Basics_Java {
	public void name() {
		String fn="Anusha";
		String ln="Velmurugan";
		System.out.println("Name:"+fn+" "+ln);

	}
	public void add(int a,int b) {
		a=10;
		b=10;
		int c=a+b;
		System.out.println("sum: "+c);

	}
	public void sub() {
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println("Sub: "+c);

	}
	public static void main(String[] args) {
		Basics_Java a= new Basics_Java();
		a.name();
		a.add(1, 2);
		a.sub();
	}

}
