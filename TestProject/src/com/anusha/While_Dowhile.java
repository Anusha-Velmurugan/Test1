package com.anusha;

public class While_Dowhile {
	public void method1() {
     int a=2;
     int b=6;
     while (a<b) {
         System.out.println("Hiii");
		++a;
		//2<6--hii--3<6--hii---4<6--hii----5<6--hii--6<6--false
	}
     System.out.println("Welcome");
	}
	public void method2() {
		int a=5;
		int b=9;
    do {
		System.out.println("Hello");
		++a;
	} while (a<b);
	}
	public static void main(String[] args) {
		While_Dowhile a= new While_Dowhile();
		a.method1();
		a.method2();
	}

}
