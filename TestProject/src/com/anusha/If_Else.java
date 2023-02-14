package com.anusha;

import java.util.Scanner;

public class If_Else {
	public void method1() {
  Scanner a= new Scanner(System.in);
  System.out.println("Enter tamil mark:");
  int tamil = a.nextInt();
  System.out.println("Enter english mark:");
  int eng = a.nextInt();
  System.out.println("Enter maths mark:");
  int math = a.nextInt();
  System.out.println("Enter science mark:");
  int science = a.nextInt();
  System.out.println("Enter social mark:");
  int social = a.nextInt();
  int add= tamil+eng+math+science+social;
  System.out.println("Total marks obtained:"+add);
  
  if (add<=500 && add>=471) {
	System.out.println("Your grade is O");
}
  else if (add<= 470 && add>=441) {
	System.out.println("Your grade is A");
}
  else if (add<=440 && add>=401) {
	System.out.println("Your grade is B");
}
  else if (add<=400 && add>= 351) {
	System.out.println("Your grade is C");
}
  else if (add>=500 || add<=0) {
	System.out.println("Invalid marks");
}
  else {
	System.out.println("You have failed");
}
	}
public static void main(String[] args) {
	If_Else a=new If_Else();
	a.method1();
}
}
