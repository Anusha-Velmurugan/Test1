package com.anusha;

public class Student_Constructor {
	public Student_Constructor() {//non-parameterized constructor
		System.out.println("                     STUDENT DETAILS                                  ");
		System.out.println("========================================================================");
	}
    public Student_Constructor(String name,int age) {//parameterized 
    	this();
    	name="Aathi sankar";
    	age=20;
    	System.out.println("Student Name: "+name);
    	System.out.println("Student age: "+ age);
    }
    public Student_Constructor(String clg,String deg) {//parameterized
    	this("d", 3);
    	clg="SSN College Of Engineering";
    	deg="B.E-EEE";
    	System.out.println("name Of The College: "+clg);
    	System.out.println("Degree: "+deg);
		
	}
    public  Student_Constructor(int sem,String status) {//parameterized
    	this("b", "c");
    	sem=6;
    	status="Pass";
    	System.out.println("Current Semester: "+sem);
    	System.out.println("Result Status: "+status);
		
	}
    public static void main(String[] args) {
		Student_Constructor a= new Student_Constructor(1, "a");
	}
}
