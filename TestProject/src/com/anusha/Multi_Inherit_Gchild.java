package com.anusha;

public class Multi_Inherit_Gchild extends Single_Inherit_Child {
	public void propThree() {
		int car=200000;
		System.out.println("car worth of "+car +" owned by Grand Child");

	}
	public static void main(String[] args) {
		Multi_Inherit_Gchild a= new Multi_Inherit_Gchild();
		a.propOne();
		a.propTwo();
		a.propThree();
	}

}
