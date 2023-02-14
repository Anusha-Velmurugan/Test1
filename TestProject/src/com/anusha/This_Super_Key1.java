package com.anusha;

public class This_Super_Key1 extends This_Super_Key {
	@Override
	public void jaddu() {
	this.twentyTwenty();
	}
	public void twentyTwenty() {
		super.jadeja();

	}
	public static void main(String[] args) {
		This_Super_Key1 a= new This_Super_Key1();
		This_Super_Key b= new This_Super_Key();
		b.jaddu();
		b.jadeja();
		a.jaddu();
		a.twentyTwenty();
		
	}

}
