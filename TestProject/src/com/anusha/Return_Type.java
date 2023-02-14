package com.anusha;

public class Return_Type {
public String method1() {
String name="Anusha";
return name;
	}
public static int method2() {
int a=10;
int b=20;
System.out.println("Hellooooooo");
return a;
}
public static void main(String[] args) {
	Return_Type c= new Return_Type();
	String s = c.method1();
	System.out.println(s);
	int d = method2();
	System.out.println(d);
}
}
