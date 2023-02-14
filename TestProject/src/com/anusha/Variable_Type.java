package com.anusha;

public class Variable_Type {
	int a=10;//class or instance variable
	String name;
	static int b=20;//static variable
	public void add() {
		name="Mayil";
		int a=25;
		int b=35;
		System.out.println(a+b);

	}
	public void sub() {
		int a=35;//local variable--must be initialized
		int b=25;
		System.out.println(a-b);
		int c=b;
		System.out.println(c);

	}
    public static void main(String[] args) {
    	Variable_Type a= new Variable_Type();
    	a.add();
    	a.sub();
    	System.out.println(a.a);
    	System.out.println(a.name);
    	System.out.println(a.b);
    	
	}
}
