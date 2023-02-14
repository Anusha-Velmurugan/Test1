package com.anusha;

public class Jumping_State {//break,continue
	public void method1() {
    for (int i = 0; i <10; i++) {
    	if (i==6) {
    		System.out.println(i);
			break;
		}
		System.out.println(i);
	}
	}
	public void method2() {
   for (int i = 0; i <10; i++) {
	if (i==6) {
		//System.out.println(i);
		continue;
	}
	System.out.println(i);
}
	}
	public static void main(String[] args) {
		Jumping_State a=new Jumping_State();
		a.method1();
		a.method2();
	}
}
