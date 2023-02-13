package com.anusha;

public class Single_Inherit_Child extends Single_Inherit_Parent {
	public void propTwo() {
      String property="Farm House";
      System.out.println(property + " owned by child");
	}
public static void main(String[] args) {
	
	Single_Inherit_Child a= new Single_Inherit_Child();
	a.propOne();
	a.propTwo();
}
}
