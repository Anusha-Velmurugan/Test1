package com.anusha;

public class Hierarch_Inherit_Child1 extends Single_Inherit_Child{
	public void proFour() {
		String name="Villa";
		System.out.println(name+ " owned by grand child");
	
	}
	public static void main(String[] args) {
		Hierarch_Inherit_Child1 a = new Hierarch_Inherit_Child1();
		a.propOne();
		a.propTwo();
		a.proFour();
		
	}

}
