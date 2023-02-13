package com.anusha;

public class Data_Types {
	//datatype var.name= value
	public void input() {
		String name="Anusha";
		int age = 23;
		String location="Chennai";
		int salary=30000;
		long contact=6384341213l;
		float emi1=3000.12345f;
		double emi2=5000.123456789d;
		
		System.out.println("Name of the employee:" + name);
		System.out.println("Age Of The Employee:" + age);
		System.out.println("Location of the employee:" +location);
		System.out.println("Contact number:" +contact);
		System.out.println("Current salary:" +salary);
		System.out.println("EMI-1:" +emi1);
		System.out.println("EMI-2:" +emi2);

	}
	public static void main(String[] args) {
		Data_Types a=new Data_Types();
		a.input();
	}

}
