package com.anusha;

import java.util.Scanner;

public class Scanner_Class {
	public void bot() {
    Scanner a=new Scanner(System.in);
    System.out.println("---------Chat Bot--------");
    System.out.println("Welcome!");
    System.out.println("Enter your name here:");
    String name = a.nextLine();
    System.out.println("Good to hear from you!"+name+"Please enter your age");
    int age = a.nextInt();
    a.nextLine();
    System.out.println("You are eligible for this course");
    System.out.println("May I know your 10th mark,Please enter here");
    int mark = a.nextInt();
    a.nextLine();
    System.out.println("Enter maximum marks here:");
    int max = a.nextInt();
     int tpr = (mark/max)*100;
    System.out.println("Great!you have got "+tpr+"so you are eligible for merit scholarship");
    a.nextLine();
    System.out.println("If you need any assistance..I am here..Thank you!");
	}
   public static void main(String[] args) {
	Scanner_Class b= new Scanner_Class();
	b.bot();
	
}
}
