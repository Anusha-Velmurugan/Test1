package com.anusha;

public class Method_Ovrd1 extends Method_Ovrd {
	
@Override
public void anusha() {
	System.out.println("At home - Daugter");
}
public static void main(String[] args) {
	Method_Ovrd a = new Method_Ovrd();
	Method_Ovrd1 b= new Method_Ovrd1();
	a.anusha();
	b.anusha();
}
}
