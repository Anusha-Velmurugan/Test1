package com.anusha;

import java.util.Scanner;

public class Switch_Case {
	public void method1() {
		Scanner b=new Scanner(System.in);
		System.out.println("enter day no:");
		int day = b.nextInt();
      
      switch (day) {
	case 1:
		System.out.println("Day-MONDAY");
		break;
	case 2:
		System.out.println("Day-TUESDAY");
		break;
	case 3:
	System.out.println("Day-WEDNESDAY");
	    break;
	case 4:
		System.out.println("Day-THURSDAY");
		break;
	case 5:
		System.out.println("Day-FRIDAY");
		break;
	case 6:
	System.out.println("Day-SATURDAY");
	    break;
	case 7:
		System.out.println("Day-SUNDAY");
		break;
	default:
		System.out.println("INVALID ENTRY");
		break;
	}
	}
	public static void main(String[] args) {
		Switch_Case a=new Switch_Case();
		a.method1();
	}

}
